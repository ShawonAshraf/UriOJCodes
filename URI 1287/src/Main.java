import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String s;
            s = in.nextLine();

            try {
                String x = s.replaceAll("(\\s+)|(,)", "");
//            System.out.println(x);

                x = x.replace('l', '1');
                x = x.replace('O', '0');
                x = x.replace('o', '0');

//            System.out.println(x);

                int d = Integer.parseInt(x);
                System.out.println(d);

            } catch (Exception e) {
                System.out.println("error");
            }
        }

        in.close();
    }
}
