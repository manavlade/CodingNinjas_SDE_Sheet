package Medium.Strings;

import java.util.HashMap;

public class compress {
    /*
     * Question
     * Ninja has been given a program to do basic string compression. For a
     * character that is consecutively repeated more than once, he needs to replace
     * the consecutive duplicate occurrences with the count of repetitions.
     * Example:
     * If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".
     * The string is compressed only when the repeated character count is more than
     * 1.
     * Note :
     * The consecutive count of every character in the input string is less than or
     * equal to 9.
     */
    public static String compressTheString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }
        return compressed.toString();
    }

}
