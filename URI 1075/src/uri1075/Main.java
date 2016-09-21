package uri1075;


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

            for(int i = 1; i <= 10000; i++)
            {
                if(i % n == 2) System.out.println(i);
            }
        }

        in.close();
    }

}
