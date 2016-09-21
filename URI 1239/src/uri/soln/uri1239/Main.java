package uri.soln.uri1239;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            String x = in.nextLine();
            int l = x.length();
            boolean bTag = false;
            boolean iTag = false;

            for(int i = 0; i < l; i++) {
                char c = x.charAt(i);
                switch (c) {
                    case '_':
                        if(!iTag) {
                            System.out.print("<i>");
                            iTag = true;
                        }
                        else {
                            System.out.print("</i>");
                            iTag = false;
                        }
                        break;

                    case '*':
                        if(!bTag) {
                            System.out.print("<b>");
                            bTag = true;
                        }
                        else {
                            System.out.print("</b>");
                            bTag = false;
                        }
                        break;

                    default:
                        System.out.print(c);
                        break;
                }

                if(i == l - 1) System.out.print("\n");
            }
        }

        in.close();
    }
}
