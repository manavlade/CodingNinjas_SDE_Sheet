package Strings;

import java.util.Arrays;

public class LongestPalindromic {
    /*
     * Question
     * Given an array of strings arr[]. Return the longest common prefix among each
     * and every strings present in the array. If there's no prefix common in all
     * the strings, return "".
     * 
     * Examples :
     * 
     * Input: arr[] = ["geeksforgeeks", "geeks", "geek", "geezer"]
     * Output: "gee"
     * Explanation: "gee" is the longest common prefix in all the given strings.
     */

    public String longestCommonPrefix(String arr[]) {
        StringBuilder result = new StringBuilder();

        Arrays.sort(arr);

        char first [] = arr[0].toCharArray();
        char second [] = arr[arr.length-1].toCharArray();

        for (int i = 0; i < first.length; i++) {
            if(first[i] != second[i]){
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }
}
