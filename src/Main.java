import algorithms.recursion.*;
import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CheckIfArrayIsSorted sorted = new CheckIfArrayIsSorted();
        System.out.println(sorted.isSorted(new int[]{0, 1, 2, 4, 3, 5, 6}));
    }
}