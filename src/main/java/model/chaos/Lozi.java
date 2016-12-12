package model.chaos;

/**
 *
 * @author adam
 */
public final class Lozi extends Chaos {

    private double A;
    private double B;

    public Lozi(){

        A = 1.7;
        B = 0.5;
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
        
        yn = x;
        xn = 1 - this.A*Math.abs(x) + this.B * y;
        
        return new Double[]{xn, yn};
        
    }
    
}
