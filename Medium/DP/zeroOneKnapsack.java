package Medium.DP;

import java.util.ArrayList;

public class zeroOneKnapsack {
    /*
     * Question
     * A thief is robbing a store and can carry a maximum weight of ‘W’ into his
     * knapsack. There are 'N' items available in the store and the weight and value
     * of each item is known to the thief. Considering the constraints of the
     * maximum weight that a knapsack can carry, you have to find the maximum profit
     * that a thief can generate by stealing items.
     * 
     * Note: The thief is not allowed to break the items.
     * 
     * For example, N = 4, W = 10 and the weights and values of items are weights =
     * [6, 1, 5, 3] and values = [3, 6, 1, 4]. Then the best way to fill the
     * knapsack is to choose items with weight 6, 1 and 3. The total value of
     * knapsack = 3 + 6 + 4 = 13.
     */
    public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
        
        int dp [][] = new int[n+1][w+1];

        for (int i = 1; i <= n; i++) {
            int currentWeight = weights.get(i-1);
            int currentValue = values.get(i-1);

            for (int j = 1; j <= w; j++) {
                if(currentWeight <= j){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j- currentWeight] + currentValue);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][w];
    }
}