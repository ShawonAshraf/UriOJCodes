package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

	    Scanner x = new Scanner(System.in);
        int a, b, m;


        while(x.hasNext()) {
            a = x.nextInt();
            b = x.nextInt();

            m = a * b;

            System.out.println("PROD = " + m);
        }

        x.close();

    }
}
