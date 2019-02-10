import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static class SubSequenceCount {
        public int count;
        public int pos;

        public SubSequenceCount(int count, int pos) {
            this.count = count;
            this.pos = pos;
        }

        @Override
        public String toString() {
            return "SubSequenceCount{" +
                    "count=" + count +
                    ", pos=" + pos +
                    '}';
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);


        int testCaseNo = 0;

        while (in.hasNext()) {
            testCaseNo++;

            String sub = in.nextLine();
            String seq = in.nextLine();

            SubSequenceCount subs = subSequenceCount(seq, sub);
            int count = subs.count;
            int pos = subs.pos;

            System.out.println(String.format("Caso #%d:", testCaseNo));
            System.out.println(count == 0 ? "Nao existe subsequencia\n" : String.format(
                    "Qtd.Subsequencias: %d\nPos: %d\n",
                    count,
                    pos
            ));
        }

        in.close();
    }

    public static SubSequenceCount subSequenceCount(String seq, String sub) {
        int seqLen = seq.length();
        int startIndex = 0;
        int indexOffset = sub.length() - 1; // how many indices after start
        int endIndex = startIndex + indexOffset;
        int pos = 0;
        int count = 0;

        for (int i = 0; endIndex < seqLen; i++) {
            // form a subStr
            // add 1 since subString works start ..< end
            String subStr = seq.substring(startIndex, endIndex + 1);

            if (subStr.equals(sub)) {
                count++;
                pos = startIndex;
            }

            startIndex++;
            endIndex++;
        }

        // since we're working with indexes and indexes start from 0,
        // return pos + 1
        return new SubSequenceCount(count, pos + 1);
    }
}
