import algorithms.sorting.cyclic.CyclicSort;
import algorithms.sorting.cyclic.FindDisappearedNumbers;
import algorithms.sorting.cyclic.FindMissingElements;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();
        List<Integer> output = findDisappearedNumbers.findDisappearedNumbers(new int[]{2, 3, 2, 1});
        System.out.println(output);
    }
}