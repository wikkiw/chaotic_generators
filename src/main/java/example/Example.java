
package example;

import java.util.Locale;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import util.random.HenonRandom;

/**
 *
 * @author wiki on 12/12/2016
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * Example of generating 5000 random real numbers by Henon chaotic generator
         */
        
        util.random.HenonRandom rndGen = new HenonRandom();
        int count = 5000;
        double rnd;
        
        double[] arr = new double[count];
        
        System.out.println("data = {");
        
        for(int i =0; i < count; i++) {
            rnd = rndGen.nextDouble();
            
            System.out.print(String.format(Locale.US, "%.10f", rnd));
            if(i < count-1) {
              System.out.print(",");  
            }
            
            arr[i] = rnd;
        }
        
        System.out.println("\n};");
        
        System.out.println("Mean value: " + new Mean().evaluate(arr));
        System.out.println("Min value: " + new Min().evaluate(arr));
        System.out.println("Max value: " + new Max().evaluate(arr));
        System.out.println("STD value: " + new StandardDeviation().evaluate(arr));
        
    }
    
}
