package Easy.Arrays;

import java.util.Stack;

public class Question8 {
    /*
     * Question
     * You are given an array 'a' of size 'n'.
     * Print the Next Greater Element(NGE) for every element.
     * The Next Greater Element for an element 'x' is the first element on the right
     * side of 'x' in the array, which is greater than 'x'.
     * If no greater elements exist to the right of 'x', consider the next greater
     * element as -1.
     * For example:
     * Input: 'a' = [7, 12, 1, 20]
     * 
     * Output: NGE = [12, 20, 20, -1]
     * 
     * Explanation: For the given array,
     * 
     * - The next greater element for 7 is 12.
     * 
     * - The next greater element for 12 is 20.
     * 
     * - The next greater element for 1 is 20.
     * 
     * - There is no greater element for 20 on the right side. So we consider NGE as
     * -1.
     * 
     * CODE DRY RUN
     * Let's perform a detailed dry run of the given code using the example array `a
     * = [7, 12, 1, 20]`.
     * 
     * ### Initialization
     * - `arr` = `[7, 12, 1, 20]`
     * - `n` = 4 (length of the array)
     * - `result` = `[0, 0, 0, 0]` (initialize with zeroes)
     * - `stack` = `[]` (empty stack)
     * 
     * ### Iteration from right to left
     * 
     * #### Iteration 1: i = 3
     * - Current element: `arr[3] = 20`
     * - Stack: `[]` (empty)
     * - Since the stack is empty, there is no greater element to the right of `20`
     * - `result[3] = -1` (set result for `20` to -1)
     * - Push `20` onto the stack
     * - `stack` = `[20]`
     * - `result` = `[0, 0, 0, -1]`
     * 
     * #### Iteration 2: i = 2
     * - Current element: `arr[2] = 1`
     * - Stack: `[20]`
     * - Stack top (`20`) is greater than `1`, so no need to pop
     * - The next greater element for `1` is `20` (stack top)
     * - `result[2] = 20` (set result for `1` to 20)
     * - Push `1` onto the stack
     * - `stack` = `[20, 1]`
     * - `result` = `[0, 0, 20, -1]`
     * 
     * #### Iteration 3: i = 1
     * - Current element: `arr[1] = 12`
     * - Stack: `[20, 1]`
     * - Pop elements from the stack until we find a greater element or the stack is
     * empty. Since `1` is less than `12`, we pop `1`.
     * - `stack` = `[20]` (after popping `1`)
     * - Stack top (`20`) is greater than `12`, so no need to pop further
     * - The next greater element for `12` is `20` (stack top)
     * - `result[1] = 20` (set result for `12` to 20)
     * - Push `12` onto the stack
     * - `stack` = `[20, 12]`
     * - `result` = `[0, 20, 20, -1]`
     * 
     * #### Iteration 4: i = 0
     * - Current element: `arr[0] = 7`
     * - Stack: `[20, 12]`
     * - Stack top (`12`) is greater than `7`, so no need to pop
     * - The next greater element for `7` is `12` (stack top)
     * - `result[0] = 12` (set result for `7` to 12)
     * - Push `7` onto the stack
     * - `stack` = `[20, 12, 7]`
     * - `result` = `[12, 20, 20, -1]`
     * 
     * ### Final Result
     * The final result array is `[12, 20, 20, -1]`.
     * 
     * ### Explanation of Final Result
     * - For `7`, the next greater element is `12`.
     * - For `12`, the next greater element is `20`.
     * - For `1`, the next greater element is `20`.
     * - For `20`, there is no greater element on the right, so `-1`.
     * 
     * ### Summary
     * The algorithm efficiently determines the next greater element for each
     * element by iterating from right to left and using a stack to keep track of
     * the elements for which we need to find the next greater element. The time
     * complexity is O(n).
     * 
     * ### Suggestions for Next Steps
     ** a.** Add unit tests to verify the function with different edge cases.
     ** b.** Add comments to explain the logic for better readability and
     * maintenance.
     * 
     * MOST IMPORTANT PYQ
     */
    public static int[] nextGreaterElement(int[] arr, int n) {
        int result[] = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }
        return result;
    }
}
