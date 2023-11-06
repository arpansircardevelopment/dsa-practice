import algorithms.recursion.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RecursiveMergeSort recursiveMergeSort = new RecursiveMergeSort();
        int[] answer = recursiveMergeSort.mergeSort(new int[]{3, 4, 5, 2, 1});
        System.out.println(Arrays.toString(answer));
    }
}