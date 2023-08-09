package algorithms.searching.binary;

public class BinarySearch {
    public int search(int[] arr, int target) {
        arr = sort(arr);
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    private int[] sort(int[] arr) {
        // TODO
        return arr;
    }
}