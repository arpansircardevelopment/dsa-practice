package ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersMissingInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != (j + 1)) {
                missingNumbers.add(j + 1);
            }
        }

        return missingNumbers;
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
