package arrays;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int size = nums.length;

        for (int i = size - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            reverse(nums, 0, size - 1);
        } else {
            int prev = index;
            for (int i = index + 1; i < size; i++) {
                if (nums[i] > nums[index - 1] && nums[i] < nums[prev]) {
                    prev = i;
                }
            }

            swap(nums, index - 1, prev);
            reverse(nums, index, size - 1);
        }

        System.out.println(Arrays.toString(nums));
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
}
