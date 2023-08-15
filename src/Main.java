import algorithms.searching.binary.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FindInMountainArray find = new FindInMountainArray();
        int output = find.findInMountainArray(3, new int[]{0, 1, 2, 4, 2, 1});
        System.out.println(output);
    }
}