package Easy.Arrays;

public class findDuplicate {
    /*
     * Question
     * Given an array of integers nums containing n + 1 integers where each integer
     * is in the range [1, n] inclusive.
     * There is only one repeated number in nums, return this repeated number.
     * You must solve the problem without modifying the array nums and using only
     * constant extra space.
     */
    public int findDuplicate(int[] nums) {
        boolean arr[] = new boolean[nums.length];

        for (int i : nums) {

            if (arr[i]) {
                return i;
            }

            arr[i] = true;
        }
        return 1;
    }
}
