import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String trace = in.nextLine();
            int processes = in.nextInt();
            in.nextLine();

            Stack<Character> cycleStack = new Stack<>();
            int l = trace.length();
            int cycleCount = 0;

            for (int i = 0; i < l; i++) {
                char op = trace.charAt(i);

                if (cycleStack.isEmpty() == false) {
                    char top = cycleStack.peek();
                    if (top == op) {
                        cycleStack.push(op);
                    } else {
                        int n = cycleStack.size();
                        cycleCount += (n / processes) + 1;
                        cycleStack.clear();
                    }

                } else {
                    cycleStack.push(op);
                    cycleCount++;
                }
            }

            System.out.println(cycleCount);
        }

        in.close();
    }
}
