import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int tc;
        int[] frequency = new int[26];
        String text;

        tc = in.nextInt();
        in.nextLine();

        for(int i = 0; i < tc; i++) {
            text = in.nextLine().replace(" ", "").toLowerCase();
            int len = text.length();
            Arrays.fill(frequency, 0);

            for(int j = 0; j < len; j++) {
                char c = text.charAt(j);
                if(Character.isAlphabetic(c)) {
                    int index = getInd(c);
                    frequency[index]++;
                }
            }

//            System.out.println(Arrays.toString(frequency));
            int[] temp = Arrays.copyOf(frequency, 26);
            int maxData = getMax(temp);
//            System.out.println(Arrays.toString(frequency));
            printResult(frequency, maxData);
        }

        in.close();
    }

    public static int getInd(char c) {
        int index = c - 97;
        return index;
    }

    public static int getMax(int[] ar) {
        int max = 0;
        Arrays.sort(ar);
        max = ar[ar.length - 1];

        return max;
    }

    public static char indexChar(int x) {
        char c = (char)(97 + x);
        return c;
    }

    public static void printResult(int[] frequency, int max) {
        int s = frequency.length;
        for(int i = 0; i < s; i++) {
            if(frequency[i] == max) {
                char c = indexChar(i);
                System.out.print(c);
            }
        }
        System.out.println();
    }
}
