
import java.util.Random;
import java.util.stream.IntStream;
import sorting_algorithms.Selection;

public class App {
    public static void main(String[] args) throws Exception {
        // SortingManager sm = new SortingManager(10,new Selection());
        int[] arr = IntStream.range(0, 100000).toArray();
        Random rng = new Random();
        for (int i = 0; i < arr.length; i++) {
            int pos = rng.nextInt(arr.length-1);
            arr[pos] = i;
        }
        SortingManager sm = new SortingManager(arr, new Selection());
        System.out.println(sm.run());
    }
}
