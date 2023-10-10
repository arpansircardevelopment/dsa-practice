import algorithms.recursion.*;
import algorithms.sorting.cyclic.*;
import algorithms.sorting.insertion.InsertionSort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FindAllPositionsOfAnElement element = new FindAllPositionsOfAnElement();
        System.out.println(element.find(new int[]{3, 1, 2, 3, 3, 3, 6}, 3));
    }
}