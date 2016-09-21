package uri1115;

import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) throws IOException
    {
	    Scanner in = new Scanner(System.in);
        int x, y;

        while(in.hasNext())
        {
            x = in.nextInt();
            y = in.nextInt();

            if(x == 0 || y == 0) break;
            if(x > 0 && y > 0) System.out.println("primeiro");
            if(x < 0 && y > 0) System.out.println("segundo");
            if(x < 0 && y < 0) System.out.println("terceiro");
            if(x > 0 && y < 0) System.out.println("quarto");
        }

        in.close();
    }
}
