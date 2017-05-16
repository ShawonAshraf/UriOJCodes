import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String input = in.nextLine();
            String[] ops = input.split(" ");


            if (ops[0].equals("0") && ops[1].equals("0")) {
                break;
            } else {
                int carryCount = 0;

                String op1 = ops[0];
                String op2 = ops[1];

                int l = op2.length();

                for (int i = l - 1; i >= 0; i--) {
                    int a = op2.charAt(i) - '0';
                    int b = op1.charAt(i) - '0';

                    int sum = a + b;
                    int carry = sum / 10;

                    if (carry != 0) {
                        carryCount++;
                    }
                }

                if (carryCount == 1) System.out.println("1 carry operation.");
                else if (carryCount > 1) System.out.println(carryCount + " carry operations.");
                else System.out.println("No carry operation.");
            }
        }

        in.close();
    }
}
