package uri.soln.uri1253;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int t, shift;
        String s;

        final int zVal = (int)('Z');

        while(in.hasNext()) {
            t = Integer.parseInt(in.nextLine());

            for(int i = 0; i < t; i++) {
                s = in.nextLine();
                shift = Integer.parseInt(in.nextLine());

                if(shift == 0) {
                    System.out.println(s);
                }
                else {
                    int l = s.length();
                    for (int j = 0; j < l; j++) {
                        char c = s.charAt(j);
                        char x = (char)(c - shift);

                        if(!Character.isAlphabetic(x)) {
                            x = (char)(zVal - ((shift - 1) - (c - 'A')));
                        }

                        System.out.print(x);
                    }
                    System.out.print("\n");
                }
            }
        }

        in.close();
    }
}
