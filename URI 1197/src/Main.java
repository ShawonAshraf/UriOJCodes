import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int v = in.nextInt();
            int t = in.nextInt();

            int s = 2 * v * t;
            System.out.println(s);
        }

        in.close();
    }
}
