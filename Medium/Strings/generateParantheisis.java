package Medium.Strings;

import java.util.ArrayList;

public class generateParantheisis {
    /*
     * Question
     * You are given an integer 'N', your task is to generate all combinations of
     * well-formed parenthesis having ‘N’ pairs.
     * A parenthesis is called well-formed if it is balanced i.e. each left
     * parenthesis has a matching right parenthesis and the matched pairs are well
     * nested.
     * For Example:
     * For ‘N’ = 3,
     * All possible combinations are:
     * ((()))
     * (()())
     * (())()
     * ()(())
     * ()()()
     */
     public static ArrayList<String> validParenthesis(int n){
        ArrayList<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    } 

    public static void generate(ArrayList<String> result , String current, int open, int close, int n){
        if(current.length() == n * 2){
            result.add(current);
            return;
        }

        if(open < n){
            generate(result, current + "(", open + 1, close, n);
        }

        if(close < open){
            generate(result, current + ")", open, close +1, n);
        }
    }
}
