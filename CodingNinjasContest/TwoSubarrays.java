package CodingNinjasContest;

public class TwoSubarrays {
    /*
     * Question
     * You are given an array 'A' of 'N' integers numbered from '0' to 'N - 1'. It
     * is guaranteed that 'A' is sorted in non-decreasing order.
     * 
     * 
     * 
     * You are required to determine if two different subarrays exist of the same
     * length such that the sum of the elements of the first subarray is equal to
     * the sum of the elements of the second subarray. Return '1' in that case.
     * Otherwise, return '0'.
     *  Note that subarrays are considered different if any of the starting and
     * ending indices differ.
     * Example:
     * N = 5
     * A = [2, 5, 5, 5, 9]
     * There exist subarrays ['A[1]', 'A[2]'] and ['A[2]', 'A[3]'] with the sum of
     * the elements equal to '10'.
     * So, the answer for this case is '1'.
     */
    public static int twoSubarrays(int n, int[] v) {
        for (int i = 1; i < n; i++) {
            if (v[i] == v[i - 1]) {
                return 1;
            }
        }
        return 0;
    }
}
