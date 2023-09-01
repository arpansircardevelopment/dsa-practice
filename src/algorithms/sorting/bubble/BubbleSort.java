package algorithms.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean swapped = false;

            for (int j = 1; j < array.length - i; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}