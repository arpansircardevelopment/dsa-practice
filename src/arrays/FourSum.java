package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();

        if (nums == null || nums.length == 0) return res;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int left = j+1;
                int right = nums.length - 1;

                int target2 = target - nums[i] - nums[j];

                while (left < right) {
                    int twoSum = nums[left] + nums[right];

                    if (twoSum < target2) left++;

                    else if (twoSum > target2) right--;

                    else {
                        ArrayList<Integer> result = new ArrayList<>();

                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[left]);
                        result.add(nums[right]);
                        res.add(result);

                        while (left < right && nums[left] == result.get(2)) ++left;

                        while (left < right && nums[right] == result.get(3)) --right;
                    }

                }

                while (j+1<n && nums[j+1] == nums[j]) ++j;
            }

            while (i + 1 < n && nums[i+1] == nums[i]) ++i;
        }

        return res;
    }

}