package algorithms.searching.binary;

public class CeilingOfANumber {

    public int ceiling(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        if (target > array[array.length - 1]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return start;
    }
}
