import sorting_algorithms.SortType;

public class SortingManager {
    public int NUM_BARS;
    public SortType st;
    public int[] array;

    public SortingManager(int[] array, SortType st) { // habria que pasarle el NUM_BARS
        this.array = array;
        this.st = st;
    }

    // shuffle aca
    
    public long run() {
        long start = System.nanoTime();

        st.runSort(this.array);

        // try {
        //     Thread.sleep(3000);
        // } catch (InterruptedException e) {}
        return (System.nanoTime() - start) / 1000000;
    }
}
