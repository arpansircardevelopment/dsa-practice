import arrays.BuyAndSellStock;
import arrays.NextPermutation;
import arrays.PascalTriangle;
import arrays.Search2DArray;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Search2DArray array = new Search2DArray();
        boolean result = array.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3);
        System.out.println(result);
    }
}