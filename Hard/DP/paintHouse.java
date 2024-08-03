package Hard.DP;

public class paintHouse {
    /*
     * QUESTION
     * You have been given ‘N’ houses, each house can be painted with any of three
     * colours: green, red and yellow. You are also given a “cost” matrix of ‘N’ * 3
     * dimension which represents the cost of painting an i-th house (0-th based
     * indexing) with j-th colour. The colour code is as follows: green - 0, red - 1
     * and yellow - 2. Now, you are supposed to find the minimum cost of painting
     * all houses such that no adjacent houses are painted with the same colour.
     */
    public static int minCost(int[][] cost) {
        int N = cost.length;
        int dp [][] = new int[N][3];

        dp[0][0] = cost[0][0];
        dp[0][1] = cost[0][1];
        dp[0][2] = cost[0][2];

        for (int i = 1; i < N; i++) {
            dp[i][0] = cost[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
            dp[i][1]  = cost[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
            dp[i][2] = cost[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
        }
        return Math.min(dp[N-1][0], Math.min(dp[N-1][1], dp[N-1][2]));
    }
}
