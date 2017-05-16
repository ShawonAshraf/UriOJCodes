import java.io.IOException;
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String args[]) throws IOException {

        Scanner in = new Scanner(System.in);
        int tc = 0;
        String word;

        while (in.hasNext()) {
            tc = in.nextInt();

            for (int i = 1; i <= tc; i++) {
                String n = in.next();
                word = in.next();

                if (word.equals("bin")) {
                    BigInteger dec = new BigInteger(n, 2);

                    System.out.println("Case " + i + ":");
                    System.out.println(dec + " dec");
                    System.out.println(dec.toString(16) + " hex");
                    System.out.println();
                } else if (word.equals("dec")) {
                    BigInteger hex = new BigInteger(n);

                    System.out.println("Case " + i + ":");
                    System.out.println(hex.toString(16) + " hex");
                    System.out.println(hex.toString(2) + " bin");
                    System.out.println();
                } else {
                    BigInteger bin = new BigInteger(n, 16);

                    System.out.println("Case " + i + ":");
                    System.out.println(bin + " dec");
                    System.out.println(bin.toString(2) + " bin");
                    System.out.println();
                }
            }

        }

        in.close();

    }
}
