import arrays.BuyAndSellStock;
import arrays.NextPermutation;
import arrays.PascalTriangle;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BuyAndSellStock stock = new BuyAndSellStock();
        int profit = stock.maxProfit(new int[]{7, 6, 4, 3, 1});
        System.out.println(profit);
    }
}