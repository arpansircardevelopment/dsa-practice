import algorithms.recursion.BinarySearch;
import algorithms.recursion.Fibonacci;
import algorithms.recursion.Recursion;
import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] array = new int[]{6, 7, 8, 9, 10};
        int output = binarySearch.search(array, 911, 0, array.length - 1);
        System.out.println(output);
    }
}