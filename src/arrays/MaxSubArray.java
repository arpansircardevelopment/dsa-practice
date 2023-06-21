package arrays;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int sum = 0;

        for (int num : nums) {
            sum = sum + num;
            maxSum = Math.max(sum, maxSum);

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}
