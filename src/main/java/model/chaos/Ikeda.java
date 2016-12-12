package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class Ikeda extends Chaos {

    private double alfa, beta, gama, mi;

    public Ikeda(){

        alfa = 6;
        beta = 0.4;
        gama = 1;
        mi = 0.9;
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

        xn = gama + mi*(x * Math.cos(beta - alfa/(1 + x*x + y*y)) - y * Math.sin(beta - alfa/(1 + x*x + y*y)));
        yn = mi*(x * Math.sin(beta - alfa/(1 + x*x + y*y)) + y * Math.cos(beta - alfa/(1 + x*x + y*y)));
        
        return new Double[]{xn, yn};
        
    }
    
}
