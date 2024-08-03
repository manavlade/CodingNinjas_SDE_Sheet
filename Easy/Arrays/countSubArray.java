package Easy.Arrays;

public class countSubArray {
    /*
     * Question
     * You are given an array/list consisting of 0 and 1 only. Your task is to find
     * the sum of the number of subarrays that contains only 1 and the number of
     * subarrays that contains only 0.
     * 
     * An array 'C' is a subarray of array 'D' if 'C' can be obtained from 'D' by
     * deletion of several elements from the beginning and several elements from the
     * end. Example :
     * 
     * Let 'ARR' = [1,0,0] then the possible subarrays of 'ARR' will be: {1}, {0},
     * {0}, {1,0}, {0,0}, {1,0,0}.
     * Example
     * If the given array 'ARR' = [1,0,0,0,1,1,0,1]
     * Then the number of 1’s subarrays will be 5. [{1},{1},{1},{1,1},{1}]
     * And the number of 0’s subarrays will be 7.
     * [{0},{0},{0},{0,0},{0,0},{0,0,0},{0}]
     * So our answer will be 5 + 7 = 12.
     */
    public static int numberofSubarrays(int n, int[] arr) {
        int totalSubrray = 0;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                totalSubrray += count * (count + 1) / 2;
                count = 1;
            }
        }
        totalSubrray += count * (count + 1) / 2;

        return totalSubrray;
    }
}
