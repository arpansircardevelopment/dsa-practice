import algorithms.sorting.bubble.BubbleSort;
import algorithms.sorting.selection.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] output = selectionSort.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(output));
    }
}