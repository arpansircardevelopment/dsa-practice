package algorithms.sorting.cyclic;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] > 0 && nums[i] <= nums.length && nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i + 1;
            }
        }

        return nums.length;
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
