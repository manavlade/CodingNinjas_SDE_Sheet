package Array;

public class SubarrayK {
    /*Question
     * Given an array of integers arr[] and a number k. Return the maximum sum of a
     * subarray of size k.Note: A subarray is a contiguous part of any given array.
     * Examples:Input: arr[] = [100, 200, 300, 400] , k = 2 Output: 700
     * Explanation: arr3 + arr4 = 700, which is maximum.
     */
    public int maximumSumSubarray(int[] arr, int k) {
        int maxSum = 0;
        int sum = 0;

        int N = arr.length;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;

        for (int i = k; i < N; i++) {
            sum += arr[i];
            sum -= arr[i-k];

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }

}
