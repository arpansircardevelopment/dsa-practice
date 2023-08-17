import algorithms.searching.binary.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CountRotations countRotations = new CountRotations();
        System.out.println(countRotations.count(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }
}