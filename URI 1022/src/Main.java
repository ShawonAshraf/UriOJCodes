import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t, n1, n2, d1, d2;
        int s_n, s_d, f_n, f_d;
        char op;
        String expression;

        while(in.hasNext()) {
            t = in.nextInt();
            in.nextLine();
            for(int i = 0; i < t; i++) {

                s_n = s_d = f_n = f_d = 0;

                expression = in.nextLine().replaceAll("\\s", "");

                String[] operands = expression.split("[\\D]");
                op = getOp(expression);


                n1 = Integer.parseInt(operands[0]);
                d1 = Integer.parseInt(operands[1]);
                n2 = Integer.parseInt(operands[2]);
                d2 = Integer.parseInt(operands[3]);

                switch (op) {
                    case '+':
                        s_n = (n1 * d2) + (n2 * d1);
                        s_d = (d1 * d2);
                        break;

                    case '-':
                        s_n = (n1 * d2) - (n2 * d1);
                        s_d = (d1 * d2);
                        break;

                    case '*':
                        s_n = n1 * n2;
                        s_d = d1 * d2;
                        break;

                    case '/':
                        s_n = n1 * d2;
                        s_d = n2 * d1;
                        break;

                    default:
                        break;

                }

                int gcd = gcd(s_n, s_d);

                f_n = s_n / gcd;
                f_d = s_d / gcd;

                if(f_d == 1) System.out.println(String.format("%d/%d = %d", s_n, s_d, f_n));
                System.out.println(String.format("%d/%d = %d/%d", s_n, s_d, f_n, f_d));
            }
        }

        in.close();
    }


    public static int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }

    public static char getOp(String ex) {
        int l = ex.length();
        char[] x = new char[3];
        for(int i = 0, j = 0; i < l; i++) {
            if(ex.charAt(i) == '/' || ex.charAt(i) == '-' || ex.charAt(i) == '+' || ex.charAt(i) == '*') {
                try {
                    x[j] = ex.charAt(i);
                    j++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.printStackTrace();
                }
            }
        }

        return x[1];
    }
}
