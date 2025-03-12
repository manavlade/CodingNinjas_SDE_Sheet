package Array;

public class Single {
    /*
     * Question
     * Given a sorted array arr[]. Find the element that appears only once in the
     * array. All other elements appear exactly twice.
     * You solution must run in O(log n) time and O(1) space.
     * Examples :
     * Input: arr[] = [1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65]
     * Output: 4
     * Explanation: 4 is the only element that appears exactly once.
     */
    int findOnce(int[] arr) {
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }

        return ans;
    }
}
