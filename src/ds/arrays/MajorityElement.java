package ds.arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int element = Integer.MIN_VALUE;
        int count = 0;

        for (int i : nums) {
            if (count == 0) {
                element = i;
            }

            if (element == i) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
