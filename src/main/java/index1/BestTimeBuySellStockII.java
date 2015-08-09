package index1;

/**
 * Created by yduan on 8/3/15.
 */
public class BestTimeBuySellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int index = 1; index < prices.length; index++) {
            profit += Math.max(0, prices[index] - prices[index - 1]);
        }

        return profit;
    }
}
