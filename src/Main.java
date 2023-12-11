import algorithms.recursion.backtracking.AllPath;
import algorithms.recursion.backtracking.Maze;
import algorithms.recursion.backtracking.Path;

import java.util.ArrayList;

public class Main {

    static boolean[][] boardArray = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };

    public static void main(String[] args) {
        int[][] path = new int[boardArray.length][boardArray[0].length];

        AllPath allPath = new AllPath();
        allPath.allPathPrint("", boardArray, 0, 0, path, 1);
    }
}