import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();

            if (n == 0) {
                break;
            }

            ArrayList<Integer> a = new ArrayList<>();
            Stack<Integer> s = new Stack<>();

            boolean inputFlag = true;
            while (inputFlag == true) {
                for (int i = 0; i < n; i++) {
                    int x = in.nextInt();
                    if (x == 0) {
                        inputFlag = false;
                        break;
                    }
                    else {
                        a.add(x);
                    }
                }

                if (inputFlag == false) {
                    break; // stop further operation
                }

                int x = a.size();
                int pos = 0;
                for (int i = 0; i < x; i++) {
                    s.push(i + 1);

                    while (!s.empty() && a.get(pos) == s.peek()) {
                        pos++;
                        s.pop();
                    }
                }

                System.out.println(s.empty() ? "Yes" : "No");
                s.clear();
                a.clear();
            }
            // print a new line
            System.out.println();
        }

        in.close();
    }
}
