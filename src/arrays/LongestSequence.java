package arrays;

import java.util.HashSet;

public class LongestSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet();
        for (int num : nums) {
            hashSet.add(num);
        }

        int longestStreak = 0;

        for (int num : nums) {
            if (!hashSet.contains(num - 1)) {
                int currentStreak = 1;
                int currentSum = num + 1;

                while (hashSet.contains(currentSum)) {
                    currentStreak++;
                    currentSum++;
                }


                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
