package algorithms.recursion;

public class BinarySearch {
    public int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        } else {
            int mid = s + (e - s) / 2;
            if (target < arr[mid]) {
                return search(arr, target, s, mid - 1);
            } else if (target > arr[mid]) {
                return search(arr, target, mid + 1, e);
            } else {
                return mid;
            }
        }
    }
}
