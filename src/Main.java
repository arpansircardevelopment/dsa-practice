import algorithms.recursion.backtracking.AllPath;
import algorithms.recursion.backtracking.Maze;
import algorithms.recursion.backtracking.Path;

import java.util.ArrayList;

public class Main {

    static boolean[][] mazeArray = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };

    public static void main(String[] args) {
        AllPath allPath = new AllPath();
        allPath.allPath("", mazeArray, 0, 0);
    }
}