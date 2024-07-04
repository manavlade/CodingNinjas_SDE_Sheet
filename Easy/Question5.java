package Easy;

import java.util.Arrays;

public class Question5 {
    /*
     * Question
     * You are given an integer ‘n’.
     * Your task is to return an array containing integers from 1 to ‘n’ (in
     * increasing order) without using loops.
     * Example:
     * Input: ‘n’ = 5
     * Output: 1 2 3 4 5
     * Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
     */
    
    public static int[] printNos(int x) {
        int[] output = new int[x];

        while (x > 0) {
            for (int i = 0; i < output.length; i++) {
                output[i] = x;
                x--;
            }
        }
        Arrays.sort(output);
        return output;
    }
}