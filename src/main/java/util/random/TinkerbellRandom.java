package util.random;

import util.random.Random;

/**
 *
 * @author adam on 25/11/2015
 */
public class TinkerbellRandom implements Random {

    final private static model.chaos.Tinkerbell rnd = new model.chaos.Tinkerbell();

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
        return "Tinkerbell";
    }

}
