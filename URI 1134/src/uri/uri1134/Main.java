package uri.uri1134;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int alcohol = 0;
        int gasolin = 0;
        int diesel = 0;
        int c;

        while((c = in.nextInt()) != 4) {
            switch (c) {
                case 1:
                    alcohol++;
                    break;
                case 2:
                    gasolin++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    break;
            }
        }

        in.close();

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcohol);
        System.out.println("Gasolina: " + gasolin);
        System.out.println("Diesel: " + diesel);
    }

}
