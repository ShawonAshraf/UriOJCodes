package uri1153;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int x, f;

        x = in.nextInt();
        f = f(x);

        System.out.println(f);

    }

    public static int f(int n) {

        if(n == 0) return 1;
        else return n * f(n - 1);

    }
}
