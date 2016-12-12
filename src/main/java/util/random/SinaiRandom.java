package util.random;

/**
 *
 * @author adam on 25/11/2015
 */
public class SinaiRandom implements Random {

    final private static model.chaos.Sinai rnd = new model.chaos.Sinai();

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
        return "Sinai";
    }

}
