package algorithms.sorting.cyclic;

public class SetMismatch {

    public int[] setMismatch(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correct = array[i] - 1;
            if (array[correct] != array[i]) {
                swap(array, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                return new int[]{array[i], i + 1};
            }
        }
        return new int[]{};
    }

    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
