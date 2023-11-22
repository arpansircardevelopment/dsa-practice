import algorithms.recursion.Subset;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        Subset subset = new Subset();
        List<List<Integer>> output = subset.subsetWithoutDuplicates(arr);
        for (List<Integer> list : output) {
            System.out.println(list);
        }
    }
}