package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class Henon extends Chaos {

    private double A;
    private double B;

    public Henon(){

        A = 1.2;
        B = 0.3;
        Random rnd = new Random();
        super.xRndStart = (rnd.nextDouble() * 0.1);
        super.yRndStart = this.xRndStart;
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
        
        xn = A - x*x + y;
        yn = B*x;

        return new Double[]{xn, yn};
        
    }
    
}
