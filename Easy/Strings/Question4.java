package Easy.Strings;

import java.util.Stack;

public class Question4 {
    /*
     * Question
     * Given an expression string 's', check whether the pairs and orders of {}, (),
     * and [] brackets are correct. If the brackets are balanced, the function
     * should return true; otherwise, it should return false.
     * Example:
     * 's' = {[()]}, the function should return true since all brackets are
     * correctly balanced.
     * 
     * However, if the string 's' = "{[()})", the expected behavior for the function
     * is to return false.
     * 
     * This is because the closing square bracket ']' is mismatched with the closing
     * parenthesis ')', resulting in unbalanced brackets.
     */
    public static boolean isBalanced(String S) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()) {
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if((c == ')' && top != '(') || (c == ']'  && top != '[') || (c ==  '}' && top != '{')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
