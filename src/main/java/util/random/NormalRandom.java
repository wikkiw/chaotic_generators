package util.random;

import org.apache.commons.math3.distribution.NormalDistribution;

/**
 * Gaussian distribution with variable mean value
 * @author wiki on 17/06/2016
 */
public class NormalRandom implements Random {

    private static NormalDistribution rnd;
    private double mean;

    public NormalRandom(double mean, double std) {
        this.mean = mean;
        rnd = new NormalDistribution(0.5, std);
    }

    @Override
    public double nextDouble() {
        
        double value = rnd.sample();
        if(value > 1) {
            value = 1;
        }
        if(value < 0) {
            value = 0;
        }
        
        value += (mean - 0.5);
        if(value < 0) {
            value += 1;
        }
        if(value > 1) {
            value -= 1;
        }
        
        return value;
    }

    @Override
    public int nextInt(int bound) {
        
        double value = this.nextDouble();
        int valToRet = ((int) Math.round(value * bound)) % bound;
        
        return valToRet;
    }
    
    @Override
    public String toString() {
        return "Normal";
    }

}
