import algorithms.recursion.*;
import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecursiveRotatedBinarySearch binarySearch = new RecursiveRotatedBinarySearch();
        int output = binarySearch.search(new int[]{5, 6, 1, 2, 3, 4}, 6);
        System.out.println(output);
    }
}