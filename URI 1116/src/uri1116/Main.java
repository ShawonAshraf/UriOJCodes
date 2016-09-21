package uri1116;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int x, y, n;

        n = in.nextInt();

        for(int i = 0; i < n; i++)
        {
            x = in.nextInt();
            y = in.nextInt();

            if(y == 0)
            {
                System.out.println("divisao impossivel");
            }

            else
            {
                double result = (double) x / (double) y;
                System.out.println(String.format("%.1f", result));
            }

        }

        in.close();
    }
}
