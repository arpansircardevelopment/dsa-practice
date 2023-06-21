import arrays.MergeIntervals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] result = mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }
}