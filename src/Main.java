import algorithms.searching.binary.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SearchInARotatedArrayWithDuplicates duplicates = new SearchInARotatedArrayWithDuplicates();
        boolean output = duplicates.search(new int[]{4, 5, 5, 5, 6, 7, 0, 1, 2, 3}, 2);
        System.out.println(output);
    }
}