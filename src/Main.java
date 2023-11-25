import algorithms.recursion.Permutations;
import algorithms.recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Permutations permutations = new Permutations();
        ArrayList<String> list = permutations.permutationsUsingIterations("", "abc");
        System.out.println(list);
    }
}