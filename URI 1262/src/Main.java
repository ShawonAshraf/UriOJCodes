import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String trace = in.nextLine().trim();
            int processes = in.nextInt();
            in.nextLine();

            int l = trace.length();
            int cycleCount = 0;

            int r_count = 0;
            int w_count = 0;

            for (int i = 0; i < l; i++) {
                char op = trace.charAt(i);

                if (op == 'R') r_count++;
                else w_count++;
            }

            double r_d = (double) r_count;
            int r = (int)(Math.ceil(r_d % processes));
            cycleCount = r + w_count;

            System.out.println(cycleCount);
        }

        in.close();
    }
}
