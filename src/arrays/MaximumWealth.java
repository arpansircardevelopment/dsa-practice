package arrays;

public class MaximumWealth {
    public int maxWealth(int[][] arr) {
        int maxWealthAmount = 0;
        int current;

        for (int[] person : arr) {
            current = 0;

            for (int account : person) {
                current += account;
            }

            if (current > maxWealthAmount) {
                maxWealthAmount = current;
            }
        }

        return maxWealthAmount;
    }
}
