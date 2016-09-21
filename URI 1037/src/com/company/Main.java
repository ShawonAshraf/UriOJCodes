package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {

        Scanner in = new Scanner(System.in);
        float n;

        while(in.hasNext())
        {
            n = in.nextFloat();

            if(n < 0.0 || n > 100.0) System.out.println("Fora de intervalo");
            else if(n >= 0.0 && n <= 25.0) System.out.println("Intervalo [0,25]");
            else if(n > 25.0 && n <= 50.0) System.out.println("Intervalo (25,50]");
            else if(n > 50.0 && n <= 75.0) System.out.println("Intervalo (0,75]");
            else if(n > 75.0 && n <= 100.0) System.out.println("Intervalo (75,100]");
        }

        in.close();

    }
}
