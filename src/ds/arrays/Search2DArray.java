package ds.arrays;

public class Search2DArray {

    // Leetcode solution
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int n = matrix.length;
        int m = matrix[0].length;

        int lo = 0;
        int hi = (n * m) - 1;

        while (lo <= hi) {
            int mid = (lo + (hi - lo) / 2);

            if (matrix[mid / m][mid % m] == target) {
                return true;
            }

            if (matrix[mid / m][mid % m] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return false;
    }

    // GFG solution
    public boolean searchMatrixGFG(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int i = 0;
        int j = m - 1;

        while (i < n && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }

            if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
