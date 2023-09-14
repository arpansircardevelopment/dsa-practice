import algorithms.sorting.cyclic.CyclicSort;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CyclicSort cyclicSort = new CyclicSort();
        int[] array = cyclicSort.sort(new int[]{5, 4, 3, 2, 1});
        System.out.println(Arrays.toString(array));
    }
}