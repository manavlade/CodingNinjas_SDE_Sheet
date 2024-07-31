package Medium.DP;

public class longestIncreasingSubsequenceString {
    /*
     * Question
     * You have been given two Strings “STR1” and “STR2” of characters. Your task is
     * to find the length of the longest common subsequence.
     * 
     * A String ‘a’ is a subsequence of a String ‘b’ if ‘a’ can be obtained from ‘b’
     * by deletion of several (possibly, zero or all) characters. A common
     * subsequence of two Strings is a subsequence that is common to both Strings.
     */
    public static int getLengthOfLCS(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp [][] = new int[n+1][m+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                
                if(i == 0 || j ==0){
                    dp[i][j] = 0;
                }

                else if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }

}
