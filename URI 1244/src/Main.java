import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine();

        for (int i = 0; i < n; i++) {
            String inputString = in.nextLine();

            // split the words from the strings based on space
            String[] splitted = inputString.split(" ");

            // push inside a list
            List<String> splittedList = new ArrayList<String>(Arrays.asList(splitted));

            // now sort
            splittedList.sort((String a, String b) -> {
                if(a.length() > b.length()) return -1;
                else return 1;
            });

            String outputString = splittedList.stream().collect(Collectors.joining(" "));
            System.out.println(outputString);
        }

        in.close();
    }
}
