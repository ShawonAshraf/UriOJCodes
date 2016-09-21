package uri1079;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        double n1, n2, n3;
        int t;

        t = in.nextInt();

        for(int i = 0; i < t; i++)
        {
            n1 = in.nextDouble();
            n2 = in.nextDouble();
            n3 = in.nextDouble();

            double sum = (n1 * 2.0) + (n2 * 3.0) + (n3 * 5.0);
            double avg = sum / 10.0;

            System.out.println(String.format("%.1f", avg));
        }

        in.close();
    }
}
