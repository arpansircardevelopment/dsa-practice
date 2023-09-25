package algorithms.sorting.cyclic;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbersInArray {
    public List<Integer> findDuplicates(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correct = array[i] - 1;
            if (array[i] != array[correct]) {
                swap(array, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> outputList = new ArrayList<>();
        for (i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                outputList.add(array[i]);
            }
        }
        return outputList;
    }

    private void swap(int[] array, int pos1, int pos2) {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
