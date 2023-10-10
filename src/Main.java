import algorithms.recursion.*;
import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindAnElement element = new FindAnElement();
        System.out.println(element.find(new int[]{0, 1, 2, 3, 4, 5, 6}, 3));
    }
}