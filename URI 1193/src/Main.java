import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int testCase;

        while(in.hasNext()) {
            try {
                testCase = Integer.parseInt(in.nextLine());
                for (int i = 0; i < testCase; i++) {
                    String[] x = in.nextLine().split(" ");

                    System.out.println("Case " + (i + 1) + ":");
                    if(x[1].equals("bin")) {
                        int bin = binToDec(x[0]);
                        System.out.println(bin + " dec");
                        System.out.println(Integer.toHexString(bin) + " hex");
                    }
                    else if(x[1].equals("dec")) {
                        int dec = Integer.parseInt(x[0]);
                        System.out.println(Integer.toHexString(dec) + " hex");
                        System.out.println(Integer.toBinaryString(dec) + " bin");
                    }
                    else if(x[1].equals("hex")) {
                        int dec = hexToDecimal(x[0]);
                        System.out.println(dec + " dec");
                        System.out.println((Integer.toBinaryString(dec) + " bin"));
                    }
                    System.out.println();
                }
            } catch (Exception e) {
//                System.out.println("BOOM");
            }
        }

        in.close();
    }


    public static int binToDec(String bin) {
        final int BASE = 2;
        int sum = 0;

        int len = bin.length();
        for (int i = len - 1; i >= 0; i--) {
            int x = bin.charAt(i) - '0';
            sum += Math.pow(2, i) * x;
        }

        return sum;
    }

    public static int hexToDecimal(String hex) {
        String digits = "0123456789ABCDEF";
        hex = hex.toUpperCase();
        int val = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
}
