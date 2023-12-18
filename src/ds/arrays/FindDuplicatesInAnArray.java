package ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInAnArray {
    public List<Integer> findDuplicatesInArray(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> outputArrayList = new ArrayList<>();
        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                outputArrayList.add(nums[i]);
            }
        }
        return outputArrayList;
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
