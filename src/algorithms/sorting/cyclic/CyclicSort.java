package algorithms.sorting.cyclic;

public class CyclicSort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int correctPosition = array[i] - 1;
            if (array[i] != array[correctPosition]) {
                swap(array, i, correctPosition);
            }
        }
        return array;
    }

    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
