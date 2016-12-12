package util.random;

/**
 *
 * @author adam on 25/11/2015
 */
public class BurgersRandom implements Random {

    final private static model.chaos.Burgers rnd = new model.chaos.Burgers();

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
        return "Burgers";
    }

}
