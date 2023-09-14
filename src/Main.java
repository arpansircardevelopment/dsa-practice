import algorithms.sorting.bubble.BubbleSort;
import algorithms.sorting.insertion.InsertionSort;
import algorithms.sorting.selection.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] output = insertionSort.sort(new int[]{3, 4, 5, - 2, 1});
        System.out.println(Arrays.toString(output));
    }
}