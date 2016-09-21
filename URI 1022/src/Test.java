import java.util.Scanner;

/**
 * Created by shawon on 4/20/16.
 */
public class Test {
    public static void main(String[] args) {
        String s = "111/3+244/3";
        String[] tok = s.split("[\\d]");
        System.out.println(tok.length);

        for (String s1 : tok) {
            System.out.println(s1);
        }

        String t = s.replace("[\\s+]", "");
        System.out.println(t.length());

        System.out.println(gcd(36,42));


        Scanner in = new Scanner(System.in);
    }
    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
