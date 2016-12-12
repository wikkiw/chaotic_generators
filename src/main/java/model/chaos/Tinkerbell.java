package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class Tinkerbell extends Chaos {

    private double A;
    private double B;
    private double C;
    private double D;

    public Tinkerbell(){

        A = 0.9;
        B = -0.6;
        C = 2;
        D = 0.5;
        Random rnd = new Random();
        super.xRndStart = -((rnd.nextDouble() * 0.09) + 0.01);
        super.yRndStart = rnd.nextDouble() * 0.1;
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

        xn = Math.pow(x,2) - Math.pow(y,2) + A*x + B*y;
        yn = 2*x*y + C*x + D*y;
        
        return new Double[]{xn, yn};
        
    }
    
}
