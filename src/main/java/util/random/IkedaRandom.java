package util.random;

/**
 *
 * @author adam on 25/11/2015
 */
public class IkedaRandom implements Random {

    final private static model.chaos.Ikeda rnd = new model.chaos.Ikeda();

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
        return "Ikeda";
    }

}
