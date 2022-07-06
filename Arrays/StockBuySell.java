//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int sellPriceForToday;
        int maxSellPrice = Integer.MIN_VALUE;

        for(int i : prices)
        {
            if(i < buyPrice)
            buyPrice = i;

            sellPriceForToday = i - buyPrice;
            maxSellPrice = Math.max(maxSellPrice, sellPriceForToday);
        }

        return maxSellPrice;
    }
}
