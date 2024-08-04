package Hard.DP;

import java.util.HashMap;
import java.util.Map;

public class coinChange {
    /*
     * Question
     * You are given an array of integers ‘coins’ denoting the denomination of coins
     * and another array of integers ‘freq’ denoting the number of coins of each
     * denomination.
     * You have to find the number of ways to make the sum ‘V’ by selecting some(or
     * all) coins from the array.
     * The answer can be very large. So, return the answer modulo 1000000007.
     * For Example :
     * ‘N’ = 3, ‘coins’ = {1, 2, 3}, ‘freq’ = {1, 1, 3}, ‘V’ = 6
     * For the given example, we can make six by using the following coins:
     * {1, 2, 3}
     * {3. 3}
     * Hence, the answer is 2.
     */
    private static final int mod = 1000000007; 

    public static int coinChange(int n, int[] coins, int[] freq, int v) {
        int dp [] = new int[v+1];
        dp[0] = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet())

        for (int i = 0; i < coins.length; i++) {
            int coin =  coins[i];
            int count =  freq[i];

            for (int j = v; j >= 0; j--) {
                for (int k = 1; k <= count; k++) {
                    if(j >=  k * coin){
                        dp[j] = (dp[j] + dp[j - k * coin]) % mod; 
                    }
                    else {
                        break;
                    }
                }
            }
        }
        return dp[v];
    }
}
