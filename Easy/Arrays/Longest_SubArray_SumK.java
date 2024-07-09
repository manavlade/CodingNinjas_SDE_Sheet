package Easy.Arrays;

public class Longest_SubArray_SumK {
    /*
     * Information about the function name *****IMPORTANT*****
     * public: The function is accessible from outside the class.
     * static: The function belongs to the class, not instances of the class.
     * int: The function returns an integer.
     * longestSubarrayWithSumK: The name of the function.
     * int[] a: An array of integers.
     * long k: The target sum for the subarray.
     * 
     * Question
     * You are given an array 'a' of size 'n' and an integer 'k'.
     * Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
     * Example :
     * Input: ‘n’ = 7 ‘k’ = 3
     * ‘a’ = [1, 2, 3, 1, 1, 1, 1]
     * 
     * Output: 3
     * 
     * Explanation: Subarrays whose sum = ‘3’ are:
     * 
     * [1, 2], [3], [1, 1, 1] and [1, 1, 1]
     * 
     * Here, the length of the longest subarray is 3, which is our final answer.
     */
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int n = a.length;
        int left = 0, right = 0;
        int maxLength = 0;
        long sum = a[0];

        while (right < n) {
            while(sum > k && left  <= right){
                sum -= a[left];
                left++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, right-left +1);
            }
            right++;

            if (right < n) {

                sum += a[right];

            }
        }
        return maxLength;
    }
}
