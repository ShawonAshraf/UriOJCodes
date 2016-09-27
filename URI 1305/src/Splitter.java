import java.util.Arrays;

/**
 * Created by shawon on 9/28/16.
 */
public class Splitter {
    public static void main(String[] args) {
        String x = "003.656930";
//        String[] a = x.split("[.]");
//        System.out.println(a.length);
//        System.out.println(Arrays.toString(a));

        double a = Double.parseDouble(x);
        int c = (int)Math.round(135.);
        System.out.println(c);
    }
}
