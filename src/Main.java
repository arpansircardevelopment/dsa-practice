import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindAllDuplicateNumbersInArray findDuplicateNumber = new FindAllDuplicateNumbersInArray();
        List<Integer> output = findDuplicateNumber.findDuplicates(new int[]{2, 3, 2, 1, 4, 4, 6, 5});
        System.out.println(output);
    }
}