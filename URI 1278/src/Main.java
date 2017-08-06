import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
//        Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(new FileInputStream(new File("src//input.txt")));

        while (in.hasNext()) {
            int n = in.nextInt();
            if (n == 0) break;

            in.nextLine(); // consume the whitespace

            ArrayList<String> stringList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String x = in.nextLine().trim().replaceAll("(\\s+)", " ");
                stringList.add(x);
            }

            int maxPadding = getMaxLen(stringList);

            stringList.forEach(k -> {
                int paddingK = maxPadding - k.length();
                for (int i = 0; i < paddingK; i++) {
                    System.out.print(" ");
                }
                System.out.println(k);
            });

            System.out.println();

        }

        in.close();
    }

    public static int getMaxLen(ArrayList<String> strList) {
        int max = 0;

        for (int i = 0; i < strList.size(); i++) {
            int l = strList.get(i).length();
            if (l > max) {
                max = l;
            }
        }

        return max;
    }
}
