import algorithms.searching.binary.SortedMatrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        SortedMatrix matrix = new SortedMatrix();
        int[] answer = matrix.search(arr, 9);
        System.out.println(Arrays.toString(answer));
    }
}