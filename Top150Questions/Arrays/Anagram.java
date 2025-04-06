import java.util.Scanner;

/*
 * Question
 * Program for checking if two strings are Anagram of each other – Is Anagram?
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a word or phrase that can be rearranged to form another word or phrase by using all the original letters exactly once. For example, 
“listen” and “silent” are anagrams because they have the same letters, even though they are arranged differently.
Problem Description
You are given two lowercase English strings, s and t. Your goal is to determine if s and t are anagrams of each other. This means they should
 contain the exact same letters, each appearing the same number of times, but they don’t have to be in the same order.
 */
public class Anagram {

    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String values");
        String str1 = "racecar";
        String str2 = "carrace";

        System.out.println(isAnagram(str1, str2));

    }
}
