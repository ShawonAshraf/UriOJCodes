import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int testCaseCount = 0;

        while (in.hasNext()) {
            int n, q;

            n = in.nextInt();
            q = in.nextInt();

            if (n == 0 && q == 0) {
                break;
            }
            testCaseCount++;
            ArrayList<Integer> numbers = new ArrayList<>();

            in.nextLine(); // consume the new line


            for (int i = 0; i < n; i++) {
                int inp = in.nextInt();
                in.nextLine(); // consume the new line
                numbers.add(inp);
            }

            // sort the array list
            numbers.sort(((o1, o2) -> (o1 < o2) ? -1 : 1)); // check if in ascending order

            // take in queries
            System.out.println("CASE# " + testCaseCount + ":");
            for (int i = 0; i < q; i++) {
                int searchKey = in.nextInt(); // query number
                if (numbers.contains(searchKey)) {
                    int position = numbers.indexOf(searchKey) + 1;
                    System.out.println(searchKey + " found at " + position);
                } else {
                    System.out.println(searchKey + " not found");
                }
            }
        }

        in.close();
    }
}
