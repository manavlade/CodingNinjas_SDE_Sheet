package Medium.Strings;

public class stringsToInteger {
    /*
     * Question
     * Implement the myAtoi(string s) function, which converts a string to a 32-bit
     * signed integer.
     * 
     * The algorithm for myAtoi(string s) is as follows:
     * 
     * Whitespace: Ignore any leading whitespace (" ").
     * Signedness: Determine the sign by checking if the next character is '-' or
     * '+', assuming positivity is neither present.
     * Conversion: Read the integer by skipping leading zeros until a non-digit
     * character is encountered or the end of the string is reached. If no digits
     * were read, then the result is 0.
     * Rounding: If the integer is out of the 32-bit signed integer range [-231, 231
     * - 1], then round the integer to remain in the range. Specifically, integers
     * less than -231 should be rounded to -231, and integers greater than 231 - 1
     * should be rounded to 231 - 1.
     * Return the integer as the final result.
     * Example 1:
     * 
     * Input: s = "42"
     * 
     * Output: 42
     * 
     * Explanation:
     * 
     * The underlined characters are what is read in and the caret is the current
     * reader position.
     * Step 1: "42" (no characters read because there is no leading whitespace)
     * ^
     * Step 2: "42" (no characters read because there is neither a '-' nor '+')
     * ^
     * Step 3: "42" ("42" is read in)
     */
    public int myAtoi(String s) {
        int index = 0;
        int n = s.length();

        int sign = 1;
        int result = 0;

        // Skip leading whitespaces
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Check if the next character is '+' or '-'
        if (index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }

        // Convert the digits to an integer
        while (index < n) {
            char currentChar = s.charAt(index);

            // Stop if the current character is not a digit
            if (currentChar < '0' || currentChar > '9') {
                break;
            }

            int digit = currentChar - '0';

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            // Update result
            result = result * 10 + digit;
            index++;
        }

        // Return the final result with the correct sign
        return result * sign;
    }

}
