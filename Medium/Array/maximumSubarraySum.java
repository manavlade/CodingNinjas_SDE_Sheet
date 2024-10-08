package Medium.Array;

public class maximumSubarraySum {
    /*
     * Question
     * You are given an array 'arr' of length 'n', consisting of integers.
     * 
     * 
     * 
     * A subarray is a contiguous segment of an array. In other words, a subarray
     * can be formed by removing 0 or more integers from the beginning and 0 or more
     * integers from the end of an array.
     * Find the sum of the subarray (including empty subarray) having maximum sum
     * among all subarrays.
     * The sum of an empty subarray is 0.
     * Example :
     * Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]
     * Output: 11
     * Explanation: The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].
     */
    public static long maxSubarraySum(int[] arr, int n) {
        long maxSum = 0;
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
