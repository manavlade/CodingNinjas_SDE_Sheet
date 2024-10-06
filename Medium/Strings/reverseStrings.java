package Medium.Strings;

import java.util.Stack;

public class reverseStrings {
    /*
     * Question
     * Given an input string s, reverse the order of the words.
     * A word is defined as a sequence of non-space characters. The words in s will
     * be separated by at least one space.
     * Return a string of the words in reverse order concatenated by a single space.
     * Note that s may contain leading or trailing spaces or multiple spaces between
     * two words. The returned string should only have a single space separating the
     * words. Do not include any extra spaces.
     * Example 1:
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     * 
     */
    public String reverseWords(String s) {
        s = s.trim();

        Stack<String> stack = new Stack<>();

        int j = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ') {
                stack.push(s.substring(j, i).trim());
                j = i+1;
            }
        }
        stack.push(s.substring(j));

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }

}
