package util.random;

/**
 *
 * @author adam on 25/11/2015
 */
public class HenonRandom implements Random {

    final private static model.chaos.Henon rnd = new model.chaos.Henon();

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
        return "Henon";
    }

}
