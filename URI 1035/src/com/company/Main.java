package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int a, b, c, d;

        while(in.hasNext())
        {
            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
            d = in.nextInt();

            int sumAB =  a + b;
            int sumCD = c + d;

            boolean m = (b > c) ? true : false;
            boolean n = (d > a) ? true : false;
            boolean p = (sumCD > sumAB) ? true : false;
            boolean q = ((c > 0) == true && (d > 0) == true) ? true : false;
            boolean r = (a % 2 == 0) ? true : false;

            if(m && n && p && q && r) System.out.println("Valores aceitos");
            else System.out.println("Valores nao aceitos");

        }

        in.close();
    }

}
