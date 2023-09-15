package algorithms.sorting.cyclic;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] array) {
        List<Integer> missingNumbers = new ArrayList<>();
        sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                missingNumbers.add(i + 1);
            }
        }

        return missingNumbers;
    }

    private void sort(int[] array) {
        int i = 0;
        while (i < array.length) {
            int correct = array[i] - 1;
            if (array[i] != array[correct]) {
                swap(array, i, correct);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] array, int i, int correct) {
        int temp = array[i];
        array[i] = array[correct];
        array[correct] = temp;
    }
}
