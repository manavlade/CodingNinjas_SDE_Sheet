package Medium.DP;

public class partitionEqualSubset {
    /*
     * Question
     * You are given an array 'ARR' of 'N' positive integers. Your task is to find
     * if we can partition the given array into two subsets such that the sum of
     * elements in both subsets is equal.
     * 
     * For example, let’s say the given array is [2, 3, 3, 3, 4, 5], then the array
     * can be partitioned as [2, 3, 5], and [3, 3, 4] with equal sum 10.
     * 
     * Follow Up:
     * 
     * Can you solve this using not more than O(S) extra space, where S is the sum
     * of all elements of the given array?
     */

    public static boolean canPartition(int[] arr, int n) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }
        if (sum % 2 != 0)
            return false;

        sum = sum / 2;

        boolean [] dp = new boolean[sum+1];

        dp[0] = true;

        for (int i : arr) {
            for (int j = sum; j >= i; j--) {
                dp[j] = dp[j] | dp[j-i]; 
            }
        }
        return dp[sum];
    }
}
