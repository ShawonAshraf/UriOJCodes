import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();

            ArrayList<Integer> even = new ArrayList<>();
            ArrayList<Integer> odd = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int x = in.nextInt();
                if ((x & 1) == 1) {
                    odd.add(x);
                } else {
                    even.add(x);
                }
            }

            even.sort((o1, o2) -> (o1 < o2) ? -1 : 1);
            odd.sort((o1, o2) -> (o1 > o2) ? -1 : 1);

            even.addAll(odd);
            even.forEach(System.out::println);
        }

        in.close();
    }
}
