package Easy.Arrays;

import java.util.Arrays;

public class Question1 {
    public static int[] printNos(int x) {
        /*
         * Question
         * You are given an integer ‘n’.
         *  Your task is to return an array containing integers from 1 to ‘n’ (in
         * increasing order) without using loops.
         * Example:
         * Input: ‘n’ = 5
         * Output: 1 2 3 4 5 
         * Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
         */
        int printn [] = new int[x];

        if(x > 0){
            for (int i = 0; i < printn.length; i++) {
                printn[i] = x;
                x--;
            }
        }
        Arrays.sort(printn);
        return printn;
    }
}