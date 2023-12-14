import algorithms.recursion.backtracking.AllPath;
import algorithms.recursion.backtracking.Maze;
import algorithms.recursion.backtracking.NQueens;
import algorithms.recursion.backtracking.Path;

import java.util.ArrayList;

public class Main {

    static boolean[][] boardArray = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
    };

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        nQueens.driver(4);
    }
}