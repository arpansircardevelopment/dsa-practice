import algorithms.searching.binary.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SearchInARotatedArray search = new SearchInARotatedArray();
        System.out.println(search.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}