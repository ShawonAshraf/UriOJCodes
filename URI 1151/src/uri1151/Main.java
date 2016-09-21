package uri1151;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int x;
        int r;

        x = in.nextInt();

        for(int i = 0; i < x; i++)
        {
            r = fibo(i);
            if(i < x - 1) System.out.print(r + " ");
            else System.out.println(r);
        }
        in.close();
    }

    public static int fibo(int x)
    {
        if (x == 0 || x == 1) return x;
        else return fibo(x - 1) + fibo(x - 2);
    }
}
