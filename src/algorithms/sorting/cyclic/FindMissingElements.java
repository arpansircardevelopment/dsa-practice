package algorithms.sorting.cyclic;

public class FindMissingElements {

    public int findMissingNumber(int[] array) {
        sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i) {
                return i;
            }
        }

        return array.length;
    }

    private void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int correct = array[i];
            if (array[i] < array.length && array[i] != array[correct]) {
                swap(array, i, correct);
            }
        }
    }

    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
