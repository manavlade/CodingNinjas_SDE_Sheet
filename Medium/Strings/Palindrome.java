package Medium.Strings;
public class Palindrome {
    /*
     * Question
     * You have been given a string STR. Your task is to find the total number of
     * palindromic substrings of STR.
     * 
     * Example :
     * If the input string is "abbc", then all the possible palindromic substrings
     * would be: ["a", "b", "b", c", "bb"] and hence, the output will be 5 since we
     * have 5 substrings in total which form a palindrome.
     * Note :
     * A string is said to be a 'Palindrome' if it is read the same forwards and
     * backwards.
     * For example, “abba” is a palindrome, but “abbc” is not.
     * 
     * A 'Substring' is a contiguous sequence of characters within a string.
     * For example, "a", "b", "c", "ab", "bc", "abc" are substrings of "abc".
     */
    public static int palindromicSubstrings(String str) {
        int n = str.length();
        int count = 0;

        for (int i = 0; i < n; i++) {
            count += countPalin(str, i, i, n);
        }

        for (int i = 0; i < n - 1; i++) {
            count += countPalin(str, i, i + 1, n);
        }
        return count;

    }

    private static int countPalin(String str, int i, int j, int n) {
        int palindCount = 0;

        while (i >= 0 && j < n && str.charAt(i) == str.charAt(j)) {
            palindCount++;
            i--;
            j++;
        }
        return palindCount;
    }
}
