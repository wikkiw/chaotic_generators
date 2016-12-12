package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class ArnoldCat extends Chaos {

    private double k;

    public ArnoldCat(){

        k = 0.1;
        Random rnd = new Random();
        super.xRndStart = (rnd.nextDouble() * 0.1);
        super.yRndStart = ((rnd.nextDouble() * 0.1) + 0.7);
        super.generateChaoticData();
    }

    /**
     * 
     * OVERRIDE THIS METHOD FOR DIFFERENT TYPES OF CHAOS.
     * 
     * @param x
     * @param y
     * @return 
     */
    @Override
    protected Double[] getNextParticle(double x, double y){

        double xn,yn;

        xn = (x + y) % 1;
        if(xn < 0){
            xn += 1;
        }
        yn = (x + k*y) % 1;
        if(yn < 0){
            yn += 1;
        }
        
        return new Double[]{xn, yn};
        
    }
    
}
