package model.chaos;

/**
 *
 * @author adam
 */
public class Dissipative extends Chaos {

    private double B;
    private double k;

    public Dissipative(){

        B = 0.6;
        k = 8.8;
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
        
        yn = (B * y + k * Math.sin(x)) % (2*Math.PI);
        if(yn < 0){
            yn += (2*Math.PI);
        }
        xn = (x + yn) % (2*Math.PI);
        if(xn < 0){
            xn += (2*Math.PI);
        }
        
        return new Double[]{xn, yn};
        
    }
    
}
