import arrays.MaxSubArray;
import arrays.MergeSort;
import arrays.SortAnArrayOfZerosAndOnes;

public class Main {
    public static void main(String[] args) {
        MaxSubArray maxSubArray = new MaxSubArray();
        int sum = maxSubArray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(sum);
    }
}