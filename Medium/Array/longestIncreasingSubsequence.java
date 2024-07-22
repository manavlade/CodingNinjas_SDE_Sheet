package Medium.Array;

public class longestIncreasingSubsequence {
    /*
     * Question
     * For a given array with N elements, you need to find the length of the longest
     * subsequence from the array such that all the elements of the subsequence are
     * sorted in strictly increasing order.
     * 
     * Strictly Increasing Sequence is when each term in the sequence is larger than
     * the preceding term.
     * 
     * For example:
     * [1, 2, 3, 4] is a strictly increasing array, while [2, 1, 4, 3] is not.
     * GOOGLE SAMSUNG
     */
    public static int longestIncreasingSubsequence(int arr[]) {
        int n = arr.length;

        int[] tails = new int[n];
        int len = 1; // Initialize the length of LIS to 1

        tails[0] = arr[0]; // Initialize the first element in the tails array

        for (int i = 1; i < n; i++) {
            if (arr[i] < tails[0]) {
                // If the current element is smaller than the smallest element in tails, update
                // tails[0]
                tails[0] = arr[i];
            } else if (arr[i] > tails[len - 1]) {
                // If the current element is greater than the largest element in tails, append
                // it to tails
                tails[len] = arr[i];
                len++;
            } else {
                // If the current element is somewhere in between, find the smallest element in
                // tails that is greater than or equal to arr[i]
                int pos = binarySearch(tails, 0, len - 1, arr[i]);
                tails[pos] = arr[i];
            }
        }

        return len;
    }

    // Binary search to find the position to insert x in tails array
    private static int binarySearch(int[] tails, int low, int high, int x) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (tails[mid] < x) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
