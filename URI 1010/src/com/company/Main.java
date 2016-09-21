package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int code1, code2;
        int unit1, unit2;
        float price1, price2, amount;


        while(in.hasNext()) {

            code1 = in.nextInt();
            unit1 = in.nextInt();
            price1 = in.nextFloat();


            code2 = in.nextInt();
            unit2 = in.nextInt();
            price2 = in.nextFloat();


            amount = (unit1 * price1) + (unit2 * price2);

            System.out.println(String.format("VALOR A PAGAR: R$ %.2f", amount));

        }

        in.close();

    }
}
