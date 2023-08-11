package algorithms.searching.binary;

public class OrderAgnosticBinarySearch {

    public int search(int[] array, int target) {
        array = sort(array);
        int low = 0;
        int high = array.length - 1;
        boolean isAsc = array[low] < array[high];

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == array[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }

    private int[] sort(int[] arr) {
        // TODO
        return arr;
    }
}
