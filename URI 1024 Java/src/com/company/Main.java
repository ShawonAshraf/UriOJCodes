package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        String in;
        int n;
        Scanner x = new Scanner(System.in);

        n = x.nextInt();

        for(int i = 0; i <= n; i++) {

            in = x.nextLine();

            char[] c = new char[in.length()];

            for(int j = in.length() - 1, k = 0; j >= 0; j--, k++) {

                if( Character.isAlphabetic(in.charAt(j)) ) c[k] = (char) (in.charAt(j) + 3);
                if(j >= c.length / 2) c[k] = (char) (in.charAt(j) - 1);

            }

            String w = new String(c);
            System.out.println(w);

        }

        x.close();
    }
}
