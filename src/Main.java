import algorithms.recursion.backtracking.Maze;
import algorithms.recursion.backtracking.Path;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Path path = new Path();
        ArrayList <String> arrayList = path.pathRetDiagonal("", 3, 3);
        System.out.printf(arrayList.toString());
    }
}