import algorithms.recursion.RecursiveBubbleSort;
import algorithms.recursion.TrianglePattern2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 1};
        RecursiveBubbleSort bubbleSort = new RecursiveBubbleSort();
        bubbleSort.sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }
}