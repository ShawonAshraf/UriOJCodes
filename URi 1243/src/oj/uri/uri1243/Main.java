package oj.uri.uri1243;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        String x;
        Scanner in = new Scanner(System.in);


        while(in.hasNext()) {
            x = in.nextLine();

            String[] tokens = x.split(" ");
            int sum = 0;
            int avg = 0, numWord = 0;

            for(String d : tokens) {
                int l = d.length();
                boolean b = false;
                int chars = 0;

                for(int i = 0; i < l; i++) {
                    char c = d.charAt(i);
                    if(Character.isDigit(c) || c == '.' && i != (l - 1)) {
                        b = true;
                        break;
                    }
                    else if(c == '.') { /*do nothing*/ }
                    else chars++;
                }

                if(b == false) {
                    sum += chars;
                    numWord++;
                }
            }

            avg = (numWord == 0) ? 0 : (sum / numWord);

            if(avg <= 3) System.out.println("250");
            else if(avg >= 4  && avg <= 5) System.out.println("500");
            else System.out.println("1000");

        }
    }
}
