package algorithms.recursion.backtracking;

import java.util.ArrayList;

public class Path {
    public void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r - 1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }

    public ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r > 1) {
            list.addAll(pathRet(p + 'D', r - 1, c));
        }

        if (c > 1) {
            list.addAll(pathRet(p + 'R', r, c - 1));
        }

        return list;
    }
}
