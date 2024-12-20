package sorting_algorithms;

public class Selection implements SortType {

    @Override
    public void runSort(int[] array) {
        int len = array.length;
        int menor, pos;
        for (int i = 0; i < len - 1; i++) {
            menor = array[i];
            pos = i;
            for (int j = i+1; j < len; j++) {
                if (array[j] < menor) {
                    menor = array[j];
                    pos = j;
                }
            }
            array[pos] = array[i];
            array[i] = menor;
        }
    }
    
}
