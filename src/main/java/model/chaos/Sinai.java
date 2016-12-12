package model.chaos;

import java.util.Random;

/**
 *
 * @author adam
 */
public final class Sinai extends Chaos {

    private double delta;

    public Sinai(){

        delta = 0.1;
        Random rnd = new Random();
        super.xRndStart = ((rnd.nextDouble() * 0.1) + 0.5);
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

        xn = (x + y + delta * Math.cos(2*Math.PI*y)) % 1;
        if(xn < 0){
            xn += 1;
        }
        yn = (x + 2*y) % 1;
        if(yn < 0){
            yn += 1;
        }
        
        return new Double[]{xn, yn};
        
    }
    
}
