import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            // take input and replace all whitespace
            // (if any)
            String inputString = in.nextLine().trim().replaceAll(" ", "");

            Map<Character, Integer> charMap = new HashMap<>();

            int len = inputString.length();
            for (int i = 0; i < len; i++) {
                char c = inputString.charAt(i);
                if (charMap.containsKey(c)) {
                    // update
                    charMap.put(c, charMap.get(c) + 1);
                }
                else {
                    // add new entry
                    charMap.put(c, 1);
                }
            }

            // sort the map in ascending order

            Comparator<Map.Entry<Character, Integer>> byValue = (a, b) -> {
                // in case we get same freq
                if (a.getValue() == b.getValue()) {
                    return b.getKey().compareTo(a.getKey());
                }

                // default ret value
                return a.getValue().compareTo(b.getValue());
            };

            List<Map.Entry<Character, Integer>> charList = new ArrayList<>(charMap.entrySet());
            Collections.sort(charList, byValue);
            charList.forEach(k -> System.out.println((int)k.getKey()+ " " + k.getValue()));
        }

        in.close();
    }
}
