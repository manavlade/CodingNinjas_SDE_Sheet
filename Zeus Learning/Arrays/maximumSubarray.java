public class maximumSubarray {
    /*
     * Question
     * Given an integer array nums, find the
     * subarray
     * with the largest sum, and return its sum.
     * Example 1:
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     */
    public int maxSubArray(int[] nums) {
        int ini = nums[0];
        int total = 0;

        for (int i : nums) {
            if (total < 0) {
                total = 0;
            }

            total += i;
            ini = Math.max(total, ini);
        }
        return ini;
    }
}
