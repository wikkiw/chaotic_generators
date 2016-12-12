package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class DelayedLogistic extends Chaos {

    private double A;

    public DelayedLogistic(){

        A = 2.27;
        Random rnd = new Random();
        double start = (rnd.nextDouble() * 0.1) + 0.8;
        super.xRndStart = start;
        super.yRndStart = start;
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

        xn = A*x*(1-y);
        yn = x;
        
        return new Double[]{xn, yn};
        
    }
    
}
