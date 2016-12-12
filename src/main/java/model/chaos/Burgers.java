package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class Burgers extends Chaos {

    private double A;
    private double B;

    public Burgers(){

        A = 0.75;
        B = 1.75;
        Random rnd = new Random();
        super.xRndStart = -((rnd.nextDouble() * 0.09) + 0.01);
        super.yRndStart = (rnd.nextDouble() * 0.09) + 0.01;
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

        xn = A*x - Math.pow(y,2);
        yn = B*y + x*y;
        
        return new Double[]{xn, yn};
        
    }
    
}
