import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<Character, Integer> freqMap = new HashMap<>();
        String data;
        int testCase;
        Scanner in = new Scanner(System.in);

        while(in.hasNext()) {
            testCase = in.nextInt();
            in.nextLine(); // suppresses the new line

            for(int i = 0; i < testCase; i++) {
                data = in.nextLine();

                // generate the freqMap
                for(char c = 'a'; c <= 'z'; c++) {
                    freqMap.put(c, 0);
                }

                data = data.toLowerCase();
                data = data.replaceAll(" ", "");
                int len = data.length();
//                System.out.println(data);

                for(int j = 0; j < len; j++) {
                    char c = data.charAt(j);
                    freqMap.putIfAbsent(c, 1);
                    freqMap.put(c, freqMap.get(c).intValue() + 1);
                }

                // get max freq
                int maxFreq = Collections.max(freqMap.values());
                for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
                    if(entry.getValue() == maxFreq) {
                        System.out.print(entry.getKey());
                    }
                }
                System.out.println();

                freqMap.clear();
            }
        }
    }
}
