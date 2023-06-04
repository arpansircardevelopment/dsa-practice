package arrays;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                output[0] = hashMap.get(target - nums[i]);
                output[1] = i;
                return output;
            }
            hashMap.put(nums[i], i);
        }

        output[0] = -1;
        output[1] = -1;
        return output;
    }
}