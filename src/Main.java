import algorithms.recursion.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Subsequence subsequence = new Subsequence();
        ArrayList<String> returned = subsequence.subsequenceReturn("", "abc");
        System.out.println(returned);
    }
}