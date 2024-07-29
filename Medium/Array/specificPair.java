package Medium.Array;

public class specificPair {
    /*
     * Question
     * You have been given a 2-D matrix ‘MAT’ of size ‘N’ x ‘N’ i.e. N rows and N
     * columns. Your task is to find the maximum value of ‘MAT[a][b]’ - ‘MAT[c][d]’
     * over all possible indices (0 <= ‘a’, ‘b’, ‘c’, ‘d’ < ‘N’) such that . ‘a’ >
     * ‘c’ and ‘b’ > ‘d’.
     */
    public static int findMaxValue(int mat[][], int n) {
        int dp[][] = new int[n][n];

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = mat[i][j];
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {

                if (i < n - 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j]);
                }

                if (j < n - 1) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j + 1]);
                }

                if (i < n - 1 && j < n - 1) {
                    maxValue = Math.max(maxValue, dp[i + 1][j + 1] - mat[i][j]);
                }
            }
        }
        return maxValue;
    }
}
