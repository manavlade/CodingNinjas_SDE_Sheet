package Medium.Array;

public class waysToMakeCoinChange {
    /*
     * Question
     * You are given an infinite supply of coins of each of denominations D = {D0,
     * D1, D2, D3, ...... Dn-1}. You need to figure out the total number of ways W,
     * in which you can make a change for value V using coins of denominations from
     * D. Print 0, if a change isn't possible.
     * Sample Input 1 :
     * 3
     * 1 2 3
     * 4
     * Sample Output 1:
     * 4
     * Explanation for Sample Output 1:
     * We can make a change for the value V = 4 in four ways.
     * 1. (1,1,1,1),
     * 2. (1,1, 2), [One thing to note here is, (1, 1, 2) is same as that of (2, 1,
     * 1) and (1, 2, 1)]
     * 3. (1, 3), and
     * 4. (2, 2)
     */
    public static long countWaysToMakeChange(int denominations[], int value) {
        long[] dp = new long[value + 1];
        dp[0] = 1;

        for (int coin : denominations) {
            for (int i = coin; i <= value; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[value];

    }
}
