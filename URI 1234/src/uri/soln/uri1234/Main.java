package uri.soln.uri1234;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            String s = in.nextLine();

            char[] a = new char[s.length()];
            boolean b = false;
            int l = s.length();

            for(int i = 0; i < l; i++) {
                char c = s.charAt(i);

                if(c == ' ') a[i] = c;
                else if(b) {
                    if(Character.isLowerCase(c)) a[i] = c;
                    else a[i] = Character.toLowerCase(c);

                    b = false;
                }
                else if(!b) {
                    if(Character.isLowerCase(c)) a[i] = Character.toUpperCase(c);
                    else a[i] = c;

                    b = true;
                }
            }

            String r = new String(a);
            System.out.println(r);
        }

        in.close();
    }
}
