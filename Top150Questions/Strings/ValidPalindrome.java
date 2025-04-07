import java.util.Scanner;

/*
 * Question
Program to check Valid Palindrome – Medium Level
Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
 */

public class ValidPalindrome {
    public static boolean ValidPalindromee(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ValidPalindromee(s));
    }
}
