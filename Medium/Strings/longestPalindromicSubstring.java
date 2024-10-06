package Medium.Strings;

public class longestPalindromicSubstring {
    /*
     * Question
     * Given a string s, return the longest
     * palindromic
     * substring
     * in s.
     * Example 1:
     * Input: s = "babad"
     * Output: "bab"
     * Explanation: "aba" is also a valid answer.
     * Example 2:
     * Input: s = "cbbd"
     * Output: "bb"
     */
    public String longestPalindrome(String s) {

        if (s == null || s.length() < 1) {
            return "";
        }

        if (s.length() == 1) {
            return s;
        }
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);

            int len2 = expandAroundCenter(s, i, i+1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2; // Adjust start index.
                end = i + maxLength / 2; // Adjust end index.
            }
        }
        // Return the longest palindrome substring.
        return s.substring(start, end + 1);
    }

    public int expandAroundCenter(String s, int start, int end){
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start -1;
    }
}
