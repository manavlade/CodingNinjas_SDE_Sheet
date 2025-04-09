package TwoPointer;

/*
 * Question
Two Integer Sum II – Medium Level Problem
You are given a sorted array of integers called numbers, arranged in non-decreasing order. Your task is to find two numbers in the array that add up to a given value called targets.

You need to return the positions of these two numbers as a list, [index1, index2], using 1-based indexing (the first element of the array is at position 1). The following conditions must be met:

The two indices, index1 and index2, must be different.
The value at index1 should appear before the value at index2 in the array.
There is exactly one correct solution for this problem. Your solution should use constant extra space (O(1)).
 */
public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int currentSum = arr[left] + arr[right];

            if (currentSum < target) {
                left++;
            } else if (currentSum > target) {
                right--;
            }

            else {
                return new int[] { left, right };
            }
        }
        return new int[] {};
    }
}
