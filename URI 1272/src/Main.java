import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            int t = in.nextInt();
            in.nextLine(); // consumes return carriage

            for(int i = 0; i < t; i++) {
                String s = in.nextLine();
                String[] tokens = s.split(" ");

                int l = tokens.length;
                for(int j = 0; j < l; j++) {
                    if(!tokens[j].isEmpty()) {
                        System.out.print(tokens[j].charAt(0));
                    }
                }

                System.out.println();
            }
        }

        in.close();
    }
}
