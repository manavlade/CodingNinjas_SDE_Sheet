package Medium.Strings;

import java.util.Stack;

public class removeKDigits {
    /*
     * Question
     * You are given a non-negative integer ‘num’ in the form of a string and
     * provided with an integer ‘k’.
     * You need to find the smallest integer possible by removing exactly ‘k’ digits
     * from ‘num.’
     * Note :
     * ‘num’ does not have leading zeros except when ‘num’ equals zero.
     * Example:
     * Input: ‘num’ = ‘141’ , ‘k’ = 1.
     * Output: ‘11’
     * Explanation: By removing only 1 digit from ‘num’, 3 numbers can be formed:
     * 14, 11, and 41. Out of which 11 is the smallest number.
     * Note :
     * You don’t have to print anything. It has already been taken care of. Just
     * implement the given function.
     * EXAMPLE DRY RUN
     * Let's dry run the provided `removeKDigits` method using the example input:
     * 
     * - `num = "141"`
     * - `k = 1`
     * 
     * The goal is to remove `k` digits from the string `num` to get the smallest
     * possible number. The code uses a stack to keep track of the digits,
     * maintaining the smallest possible number by removing digits when a smaller
     * digit is encountered.
     * 
     * ### Dry Run Explanation
     * 
     * 1. **Initialization**:
     * - `num = "141"`
     * - `k = 1`
     * - `stack = []` (an empty stack is initialized)
     * 
     * 2. **First Iteration (digit = '1')**:
     * - Stack is empty, so push '1' onto the stack.
     * - `stack = ['1']`
     * 
     * 3. **Second Iteration (digit = '4')**:
     * - Current stack: `['1']`
     * - '4' is greater than the top of the stack ('1'), so no removal occurs.
     * - Push '4' onto the stack.
     * - `stack = ['1', '4']`
     * 
     * 4. **Third Iteration (digit = '1')**:
     * - Current stack: `['1', '4']`
     * - '1' is less than the top of the stack ('4'), and we still have `k > 0` (1
     * digit left to remove).
     * - Pop '4' from the stack, decrement `k` by 1 (`k = 0` now).
     * - `stack = ['1']`
     * - Push '1' onto the stack.
     * - `stack = ['1', '1']`
     * 
     * 5. **Post-Iteration Check**:
     * - Since `k = 0`, no more digits need to be removed.
     * 
     * 6. **Constructing the Result**:
     * - Initialize `result = new StringBuilder()`.
     * - Pop elements from the stack and append them to the `result`.
     * - Pop '1': `result = "1"`
     * - Pop '1': `result = "11"`
     * - Reverse the `result` to correct the order (though in this case, it's
     * already correct).
     * 
     * 7. **Handling Leading Zeros**:
     * - There are no leading zeros, so no removal is needed.
     * 
     * 8. **Return the Result**:
     * - `result = "11"`
     * - Return `"11"`.
     * 
     * ### Final Output
     * 
     * - The smallest number possible after removing 1 digit from `"141"` is `"11"`.
     * 
     * ### Code Explanation
     * 
     * - **Stack Usage**: The stack is used to maintain a sequence of digits that
     * form the smallest possible number. If a current digit is smaller than the top
     * of the stack, the stack's top is popped to allow this smaller digit,
     * effectively removing the larger digits that precede a smaller digit.
     * - **Greedy Approach**: By always removing the larger digits that come before
     * a smaller one, the algorithm ensures that the number formed is the smallest
     * possible at each step.
     * - **Reverse and Zero Handling**: The result is built by popping from the
     * stack, resulting in a reversed number, which is then reversed back to the
     * correct order. Leading zeros are handled by trimming them from the start.
     */
    public static String removeKDigits(String num, int k) {
        // MICROSOFT PYQ
        Stack<Character> stack = new Stack<>();
        for (char i : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > i) {
                stack.pop();
                k--;
            }
            stack.push(i);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        sb.reverse();

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
