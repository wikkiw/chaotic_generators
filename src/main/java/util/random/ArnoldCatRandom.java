package util.random;

/**
 *
 * @author adam on 25/11/2015
 */
public class ArnoldCatRandom implements Random {

    final private static model.chaos.ArnoldCat rnd = new model.chaos.ArnoldCat();

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
        return "ArnoldCat";
    }

}
