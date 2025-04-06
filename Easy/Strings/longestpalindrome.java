package Easy.Strings;

import java.util.Scanner;
public class longestpalindrome {
    public static String longestPalindrome(String s) {

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

            int len2 = expandAroundCenter(s, i, i + 1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandAroundCenter(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "babad";
        longestPalindrome(str);

        System.out.println( longestPalindrome(str));
    }
}
