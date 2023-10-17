package algorithms.recursion;

public class RecursiveBubbleSort {
    public void sort(int[] arr, int n, int i) {
        if (n == 0) {
            return;
        }

        if (i < n) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            sort(arr, n, i + 1);
        } else {
            sort(arr, n - 1, 0);
        }
    }
}
