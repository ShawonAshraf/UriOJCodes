import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String num;
        String cutoff;

        while(in.hasNext()) {
            num = in.nextLine();
            cutoff = in.nextLine();

            if(num.contains(".")) {
                double numValue = Double.parseDouble(num);
                double cutoffValue = Double.parseDouble(cutoff);

                double fractionalValue = numValue - (int)numValue;

                if(fractionalValue > cutoffValue) {
                    System.out.println((int)numValue + 1);
                }
                else System.out.println((int)numValue);
            }
            else {
                System.out.println(num);
            }
        }

        in.close();
    }
}
