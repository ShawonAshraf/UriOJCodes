import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        class TShirtGetter {
            public String name;
            public char size;
            public String color;

            public TShirtGetter(String name, char size, String color) {
                this.name = name;
                this.size = size;
                this.color = color;
            }

            @Override
            public String toString() {
                return String.format("%s %c %s", color, size, name);
            }
        }

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            int n = in.nextInt();
            in.nextLine();
            if (n == 0) break;

            ArrayList<TShirtGetter> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String name = in.nextLine();

                String[] colorAndSize = in.nextLine().split(" ");
//                in.nextLine();

                String color = colorAndSize[0];
                char size = colorAndSize[1].charAt(0);

                list.add(new TShirtGetter(name, size, color));
            }

            list.sort((TShirtGetter t1, TShirtGetter t2) ->
                (t1.color.compareTo(t2.color) < 0) ? -1 : 1
            );

            list.forEach(System.out::println);
            list.clear();

            System.out.println();

        }

        in.close();
    }
}
