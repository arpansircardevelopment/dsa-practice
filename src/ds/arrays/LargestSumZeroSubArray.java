package ds.arrays;

import java.util.HashMap;

public class LargestSumZeroSubArray {
    int maxLen(int[] arr, int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int maximum = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                maximum = i + 1;
            } else {
                if (mpp.get(sum) != null) {
                    maximum = Math.max(maximum, i - mpp.get(sum));
                } else {
                    mpp.put(sum, i);
                }
            }
        }

        return maximum;
    }
}
