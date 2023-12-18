package ds.arrays;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for (int i : nums) {
            if (element1 == i) {
                count1++;
            } else if (element2 == i) {
                count2++;
            } else if (count1 == 0) {
                element1 = i;
                count1 = 1;
            } else if (count2 == 0) {
                element2 = i;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == element1) count1++;
            else if (num == element2) count2++;
        }

        List<Integer> outputList = new ArrayList<>();
        if (count1 > nums.length / 3) {
            outputList.add(element1);
        }

        if (count2 > nums.length / 3) {
            outputList.add(element2);
        }

        return outputList;
    }
}
