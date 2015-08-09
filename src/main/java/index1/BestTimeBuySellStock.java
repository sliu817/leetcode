package index1;

/**
 * Created by yduan on 2/11/15.
 */
public class BestTimeBuySellStock {

    public int maxProfit(int[] prices) {
        int minPriceIndex = 0;
        int maxProfit = 0;

        for(int index = 0; index < prices.length; index++) {
            maxProfit = Math.max(prices[index] - prices[minPriceIndex], maxProfit);
            minPriceIndex = prices[index] < prices[minPriceIndex] ? index : minPriceIndex;
        }

        return maxProfit;
    }

}
