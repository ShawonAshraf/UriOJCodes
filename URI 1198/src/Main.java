import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int a = in.nextInt();
            int b = in.nextInt();

            int difference = (a - b) > 0 ? (a - b) : ( (a - b) * (-1) );
            System.out.println(difference);
        }

        in.close();
    }
}
