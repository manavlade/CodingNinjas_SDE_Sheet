package Medium.Array;

public class stockBuySell {
    public static int bestTimeToBuyAndSellStock(int[] prices) {
        /*
         * Question
         * You are given an array of integers 'prices' of size 'n', where ‘prices[i]’ is
         * the price of a given stock on an ‘i’-th day. You want to maximize the profit
         * by choosing a single day to buy one stock and a different day to sell that
         * stock.
         * Please note that you can’t sell a stock before you buy one.
         * Sample Input 1:
         * 6
         * 7 1 5 4 3 6
         *  Sample Output 1 :
         * 5
         * Explanation Of Sample Input 1:
         * Purchase stock on day two, where the price is one, and sell it on day six,
         * where the price is 6. Profit = 6 - 1 = 5.
         */

        if (prices == null || prices.length == 0) {
            return 0;
        }

        int currentLow = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < currentLow) {
                currentLow = prices[i];
            } else {
                int profit = prices[i] - currentLow;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
