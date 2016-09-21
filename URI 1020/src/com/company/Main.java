package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {

        Scanner in = new Scanner(System.in);
        int n;

        while(in.hasNext())
        {
            n = in.nextInt();

            int y, m, d;

            y = n / 365;
            n %= 365;

            m = n / 30;

            d = n % 30;

            System.out.println(y + " ano(s)");
            System.out.println(m + " mes(es)");
            System.out.println(d + " dia(s)");
        }

        in.close();

    }
}
