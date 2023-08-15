package algorithms.searching.binary;

public class FirstAndLastPositionOfElement {

    // Brute Force Solution
    public int[] bruteForce(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        int startPointer = 0;
        boolean startPointerElementFound = false;
        int endPointer = nums.length - 1;
        boolean endPointerElementFound = false;

        while (startPointer <= endPointer) {
            if (nums[startPointer] != target && !startPointerElementFound) {
                startPointer++;
            } else {
                startPointerElementFound = true;
            }

            if (nums[endPointer] != target && !endPointerElementFound) {
                endPointer--;
            } else {
                endPointerElementFound = true;
            }

            if (startPointerElementFound && endPointerElementFound) {
                break;
            }
        }

        if (!startPointerElementFound || !endPointerElementFound) {
            return new int[]{-1, -1};
        } else {
            return new int[]{startPointer, endPointer};
        }
    }

    public int[] searchRange(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        int startElement = -1;
        int endElement = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                if (mid != 0 && nums[mid - 1] == target) {
                    high = mid - 1;
                } else {
                    startElement = mid;
                    break;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                if (mid != (nums.length - 1) && nums[mid + 1] == target) {
                    low = mid + 1;
                } else {
                    endElement = mid;
                    break;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }


        return new int[]{startElement, endElement};
    }
}
