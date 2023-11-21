package algorithms.recursion;

import java.util.ArrayList;

public class Subsequence {
    public void subsequence(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsequence(processed + ch, unprocessed.substring(1));
        subsequence(processed, unprocessed.substring(1));
    }

    public ArrayList<String> subsequenceReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> leftReturn = subsequenceReturn(p + ch, up.substring(1));
        ArrayList<String> rightReturn = subsequenceReturn(p, up.substring(1));
        leftReturn.addAll(rightReturn);
        return leftReturn;
    }
}
