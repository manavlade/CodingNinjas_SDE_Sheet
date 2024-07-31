package BitManipulation;

public class isMultipleOfThree {
    /*
     * Question
     * Given a number in its binary form find if the given binary number is a
     * multiple of 3. It is recommended to finish the task using one traversal of
     * input binary number.
     * 
     * Example 1:
     * 
     * Input: S = "0011"
     * Output: 1
     * Explanation: "0011" is 3, which is divisible by 3.
     * 
     * Dry run
     * s = "110"
     * Initial state:
     * 
     * sum = 0
     * s = "110"
     * Loop through each character:
     * 
     * First character: '1'
     * sum = (0 * 2 + (1 - '0')) % 3 = 1 % 3 = 1
     * Second character: '1'
     * sum = (1 * 2 + (1 - '0')) % 3 = (2 + 1) % 3 = 3 % 3 = 0
     * Third character: '0'
     * sum = (0 * 2 + (0 - '0')) % 3 = 0 % 3 = 0
     * Check if sum is 0:
     * 
     * sum == 0 is true, so return 1.
     * Output: 1
     */
    int isDivisible(String s) {
        int sum = 0;

        for (char i : s.toCharArray()) {
            sum  = (sum * 2 + (i - '0')) % 3;
        }

        if(sum == 0){
            return 1;
        }
        return 0;
    }
}
