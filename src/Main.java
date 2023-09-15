import algorithms.sorting.cyclic.CyclicSort;
import algorithms.sorting.cyclic.FindMissingElements;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FindMissingElements findMissingElements = new FindMissingElements();
        int output = findMissingElements.findMissingNumber(new int[]{1, 0, 2});
        System.out.println(output);
    }
}