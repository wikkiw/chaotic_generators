package model.chaos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author adam
 */
public class Chaos {

    private List<Double[]> chaoticData;
    private double maxVal;
    private int index;
    private int reevaluation;
    protected double xRndStart;
    protected double yRndStart;
    private int maxRun;

    public Chaos(){
        
        Random rnd = new Random();
        double rndStart = rnd.nextDouble() * 0.1;
//        double rndStart = 0.1;
        xRndStart = rndStart;
        yRndStart = rndStart;
        reevaluation = 0;
        maxRun = 500_000;
        generateChaoticData();
    }
    
    public final void generateChaoticData(){
        
        Double[] start = new Double[]{xRndStart, yRndStart};
        List<Double[]> chaoticList = new ArrayList<>();
        chaoticList.add(start);
        
        reevaluation++;
        index = 1;
        
        Double[] particle;
        double x, y;
        
        for(int i=0; i<maxRun-1; i++){
            
            x = chaoticList.get(i)[0];
            y = chaoticList.get(i)[1];
            
            particle = getNextParticle(x, y);
            chaoticList.add(particle);
        }
        
        chaoticData = chaoticList;
        maxVal = findMaxVal();

    }
    
    /**
     * 
     * OVERRIDE THIS METHOD FOR DIFFERENT TYPES OF CHAOS.
     * 
     * @param x
     * @param y
     * @return 
     */
    protected Double[] getNextParticle(double x, double y){

        double xn,yn;
        
        xn = x;
        yn = y;
        
        return new Double[]{xn, yn};
        
    }
    
    /**
     * 
     * @return 
     */
    public final double getRndReal(){
        
        if(index == maxRun){
            xRndStart = chaoticData.get(index - 1)[0];
            yRndStart = chaoticData.get(index - 1)[1];
            generateChaoticData();
        }
        
        double x = chaoticData.get(index)[0];
        index++;
        
        return Math.abs(x)/maxVal;
        
    }
    
    /**
     * 
     * @param bound
     * @return 
     */
    public final int getRndInt(int bound){
        
        if(index == maxRun){
            xRndStart = chaoticData.get(index - 1)[0];
            yRndStart = chaoticData.get(index - 1)[1];
            generateChaoticData();
        }
        
        double x = chaoticData.get(index)[0];
        index++;
        
        return ((int) Math.round((Math.abs(x)/maxVal)*(bound))) % bound;
        
    }

    /**
     * 
     * @return 
     */
    private double findMaxVal(){
        
        double xmaxVal = Double.MIN_VALUE;
        
        for(Double[] particle : chaoticData){
            if(Math.abs(particle[0]) > xmaxVal){
                xmaxVal = Math.abs(particle[0]);
            }
        }
        
        return xmaxVal;
        
    }
    
}
