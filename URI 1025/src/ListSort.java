import java.util.ArrayList;

/**
 * Created by shawon on 7/28/17.
 */
public class ListSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(-1);

        // sort
        System.out.println(list);
        list.sort(((o1, o2) -> (o1 < o2) ? -1 : 1));
        System.out.println(list);
    }
}
