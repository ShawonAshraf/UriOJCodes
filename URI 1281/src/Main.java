import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileInputStream inputStream = new FileInputStream(new File("data.txt"));
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(inputStream);

        while (in.hasNext()) {
            int numTrips = in.nextInt();
            for (int k = 0; k < numTrips; k++) {
                int numAvailable = in.nextInt();
                in.nextLine(); // consume the new line

                Map<String, Double> priceTable = new HashMap<>();

                // generate the shopping price table

                for (int i = 0; i < numAvailable; i++) {
                    String[] temp = in.nextLine().trim().split(" ");
                    String productName = temp[0];
                    double price = Double.parseDouble(temp[1]);

                    priceTable.put(productName, price);
                }

                // now for processing amount to take


                int numBuying = in.nextInt();
                in.nextLine(); // consume the new line
                double amountToTake = 0.0;

                for (int i = 0; i < numBuying; i++) {
                    String[] temp = in.nextLine().trim().split(" ");
                    String productName = temp[0];
                    double quantity = Double.parseDouble(temp[1]);

                    amountToTake += priceTable.get(productName) * quantity;
                }

                System.out.println(String.format("R$ %.2f", amountToTake));
            }
        }

        in.close();
    }
}
