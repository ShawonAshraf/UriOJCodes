package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int r;
        double v;

        double pi = 3.14159;

        while(in.hasNext()) {

            r = in.nextInt();

            v = (4.0/3.0) * pi * Math.pow(r, 3);

            System.out.println(String.format("VOLUME = %.3f", v));

        }

        in.close();

    }
}
