package algorithms.searching.binary;

public class FindInMountainArray {
    public int findInMountainArray(int target, int[] mountainArray) {
        int peak = findPeakIndex(mountainArray);
        int startArrayIndex = orderAgnosticBinarySearch(mountainArray, target, 0, peak);
        if (startArrayIndex != -1) {
            return startArrayIndex;
        } else {
            return orderAgnosticBinarySearch(mountainArray, target, peak + 1, mountainArray.length - 1);
        }
    }

    private int findPeakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    private int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
