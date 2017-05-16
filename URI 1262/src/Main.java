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

            Stack<Character> s = new Stack<>();

            for (int i = 0; i < l; i++) {
                char c = trace.charAt(i);

                if (c == 'W' && s.isEmpty()) {
                    w_count++;
                } else if(c == 'W' && !s.isEmpty()) {
                    r_count += (int) Math.ceil((double) s.size() / processes);
                    w_count++;
                    s.clear();
                } else {
                    s.push(c);
                }
            }

            cycleCount = r_count + w_count + (int) Math.ceil((double) s.size() / processes);
            s.clear();

            System.out.println(cycleCount);
        }

        in.close();
    }
}
