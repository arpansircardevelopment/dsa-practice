import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SetMismatch setMismatch = new SetMismatch();
        int[] output = setMismatch.setMismatch(new int[]{1, 2, 2, 4});
        System.out.println(Arrays.toString(output));
    }
}