package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int[] n = new int[100];
        int max = 0, maxIndex = 0;

        for(int i = 0; i < 100; i++)
        {
            n[i] = in.nextInt();
            if(n[i] > max)
            {
                max = n[i];
                maxIndex = i;
            }
        }

        System.out.println(max);
        System.out.println( (maxIndex + 1) );

        in.close();
    }
}
