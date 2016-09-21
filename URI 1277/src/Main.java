import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
	    int testCase;
        int numStudents;
        String[] studentNames;
        String[] attendance;

        Scanner in = new Scanner(System.in);
        testCase = in.nextInt();
        in.nextLine();

        for(int i = 0; i < testCase; i++) {
            ArrayList<String> defaulters = new ArrayList<>();

            numStudents = in.nextInt();
            in.nextLine();

            studentNames = in.nextLine().split(" ");
            attendance = in.nextLine().split(" ");

            float[] counter = new float[numStudents];
            for(int j = 0; j < numStudents; j++) {
                float perc = percentage(attendance[j]);
                if(perc < 75.00) {
                    defaulters.add(studentNames[j]);
                }
            }

            print(defaulters);
            defaulters.clear();
        }

        in.close();
    }

    public static float percentage(String data) {
        float percentage = 0;
        int countP = 0, countA = 0;

        int len = data.length();
        float div = len;
        for(int i = 0; i < len; i++) {
            if(data.charAt(i) == 'P') countP++;
            else if(data.charAt(i) == 'A') countA++;
            else if(data.charAt(i) == 'M') div--;
        }

        percentage = (countP / div) * 100;
        return percentage;
    }

    public static void print(ArrayList<String> data) {
        int len = data.size();
        for(int i = 0; i < len; i++) {
            if(i == len - 1) System.out.print(data.get(i));
            else System.out.print(data.get(i) + " ");
        }
        System.out.println();
    }
}
