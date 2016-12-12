package util.random;

import util.random.Random;

/**
 *
 * @author adam on 25/11/2015
 */
public class DelayedLogisticRandom implements Random {

    final private static model.chaos.DelayedLogistic rnd = new model.chaos.DelayedLogistic();

    @Override
    public double nextDouble() {
        return rnd.getRndReal();
    }

    @Override
    public int nextInt(int bound) {
        return rnd.getRndInt(bound);
    }

    @Override
    public String toString() {
        return "DeLo";
    }
    
}
