import algorithms.recursion.backtracking.Maze;
import algorithms.recursion.backtracking.Path;

import java.util.ArrayList;

public class Main {

    static boolean[][] mazeArray = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
    };

    public static void main(String[] args) {
        Path path = new Path();
        path.pathRestrictions("", mazeArray, 0, 0);
    }
}