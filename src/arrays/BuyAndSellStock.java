package arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minimumCostPrice = Integer.MAX_VALUE;
        int profit = 0;

        for (int price : prices) {
            if (price < minimumCostPrice) {
                minimumCostPrice = price;
            }

            int currentProfit = price - minimumCostPrice;
            if (currentProfit > profit) {
                profit = currentProfit;
            }
        }

        return profit;
    }
}