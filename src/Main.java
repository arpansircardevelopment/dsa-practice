import algorithms.recursion.*;
import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SumOfNNumbers sumOfNNumbers = new SumOfNNumbers();
        System.out.println(sumOfNNumbers.iterate(5));
    }
}