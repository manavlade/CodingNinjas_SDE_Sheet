package Medium.Strings;

public class longestCommonSubsequence {
    /*
     * Question
     * Given two strings, 'S' and 'T' with lengths 'M' and 'N', find the length of
     * the 'Longest Common Subsequence'.
     * 
     * For a string 'str'(per se) of length K, the subsequences are the strings
     * containing characters in the same relative order as they are present in
     * 'str,' but not necessarily contiguous. Subsequences contain all the strings
     * of length varying from 0 to K.
     * 
     * Example :
     * Subsequences of string "abc" are: ""(empty string), a, b, c, ab, bc, ac, abc.
     */
    public static int lcs(String s, String t) {
        int m = s.length();
        int n = t.length();

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }
        return dpSolution(m, n, s, t, dp);
    }

    private static int dpSolution(int m, int n, String s, String t, int[][] dp) {
        if (m == 0 || n == 0) {
            return 0;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        if (s.charAt(m - 1) == t.charAt(n - 1)) {
            dp[m][n] = 1 + dpSolution(m - 1, n - 1, s, t, dp);
        } else {
            dp[m][n] = Math.max(dpSolution(m - 1, n, s, t, dp), dpSolution(m, n - 1, s, t, dp));
        }

        return dp[m][n];
    }
}
