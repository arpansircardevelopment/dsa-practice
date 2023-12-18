package ds.arrays;

public class MissingNumber {

    public void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i) {
                swap(nums, i, nums[i]);
            } else {
                i++;
            }
        }

        int missingNumber = -1;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                missingNumber = j;
                break;
            }
        }

        if (missingNumber == -1) {
            missingNumber = nums.length;
        }

        System.out.println("Missing Number: " + missingNumber);
    }

    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
