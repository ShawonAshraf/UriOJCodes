import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("data.txt"));

        while (in.hasNext()) {
            int testCase = Integer.parseInt(in.nextLine());
            System.out.println();
            String newLine = in.nextLine();

            for (int i = 0; i < testCase; i++) {
                String inputString;
                Map<String, Integer> population = new HashMap<>();

                // take input

                try {
                    while (!(inputString = in.nextLine()).equals("")) {
                        if(population.containsKey(inputString)) {
                            population.put(inputString, population.get(inputString) + 1);
                        } else {
                            population.put(inputString, 1);
                        }
                    }
                } catch (Exception e) {}

                // sort list
                List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(population.entrySet());
                sortedList.sort((entry1, entry2) -> {
                    return entry1.getKey().compareTo(entry2.getKey());
                });

                // get total sum
                int sum = population.values().stream().mapToInt(Number::intValue).sum();

                // print
                sortedList.forEach(k -> System.out.println(String.format("%s %.4f",
                        k.getKey(),
                        getPerc(
                                k.getValue(),
                                sum
                        )
                )));


                System.out.println();


                population.clear();
            }
        }

        in.close();
    }

    public static float getPerc(int value, int sum) {
        float v = (float) value;
        float s = (float) sum;

        return (v / s) * 100;
    }
}
