import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int testCase;
        ArrayList<String> list = new ArrayList<>();

        while((testCase = in.nextInt()) != 0) {
            in.nextLine();
            for(int i = 0; i < testCase; i++) {
                list.add(in.nextLine());
            }

            int maxPad = 0;
            for (String x : list) {
                int d = x.length();
                if(d > maxPad) maxPad = d;
            }

            for (String x : list) {
                int space = maxPad - x.length();
                for(int i = 0; i < space; i++) System.out.print(" ");
                System.out.println(x);
            }
            System.out.println();
            list.clear();
        }

        in.close();
    }
}
