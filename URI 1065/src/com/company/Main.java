package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        double n;
        int count = 0;

        for(int i = 0; i < 5; i++)
        {
            n = in.nextDouble();
            if(n % 2.0 == 0.0) count++;
        }

        System.out.println(count + " valores pares");
        in.close();
    }
}
