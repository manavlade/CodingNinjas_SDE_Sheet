package Medium.Greedy;

import java.util.Arrays;

public class coinChange {
    /*
     * Question
     * Given an array coins[] represent the coins of different denominations and a
     * target value sum. You have an infinite supply of each of the valued
     * coins{coins1, coins2, ..., coinsm}. Find the minimum number of coins to make
     * the change. If not possible to make a change then return -1.
     * Examples:
     * Input: coins[] = [25, 10, 5], sum = 30
     * Output: 2
     * Explanation: Minimum 2 coins needed, 25 and 5
     */
    public int minCoins(int coins[], int M, int sum) {
        int dp[] = new int[sum + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]= 0;

        for (int i = 0; i < M; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                if(dp[j - coins[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                }
            }
        }
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
}
