import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String cutoffPattern = "^((0.)(\\d{4}))$";
        String cutOff = "5000";
        Pattern p = Pattern.compile(cutoffPattern);
        String data;

        while(in.hasNext()) {
            data = in.nextLine().replaceAll(" ", "");
            Matcher m = p.matcher(data);

            if(m.find()) { continue; }
            else {
                if(data.contains(".")) {
                    String[] tokens = data.split("[.]");

                    if(tokens.length == 1) {
                        System.out.println(Integer.parseInt(tokens[0]));
                    }
                    else if(tokens.length == 2 && !tokens[0].equals("")) {
                        int a = Integer.parseInt(tokens[0]);
                        if(tokens[1].length() > cutOff.length()) {
                            a++;
                        }
                        System.out.println(a);
                    }
                }
                else {
                    System.out.println(Integer.parseInt(data));
                }
            }
        }

        in.close();
    }
}
