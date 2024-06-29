package Easy.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Question9 {
    /*
     * Question
     * You are given an array/list 'asteroids' representing asteroids in a row.
     * 
     * 
     * 
     * For each element of the given array, its absolute value denotes the size of
     * that asteroid, and its sign denotes the direction it moves in(+ve meaning
     * right and -ve meaning left).
     * 
     * 
     * An asteroid with a weight of 0 denotes a massless asteroid that moves in the
     * right direction.
     * 
     * 
     * 
     * All asteroids are moving at the same speed. Whenever two asteroids collide,
     * the smaller asteroid gets destroyed.
     * 
     * 
     * If both asteroids are the same size, then both asteroids get destroyed. Two
     * asteroids moving in the same direction never collide.
     * 
     * 
     * 
     * You are supposed to find the state of the asteroids after all collisions.
     * 
     * 
     * 
     * Example :
     * Input: ‘asteroids’ = [3,-2,4]
     * 
     * Output: [3, 4]
     */
    public static List<Integer> collidingAsteroids(int[] ast) {
        int n = ast.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (ast[i] > 0 || stack.isEmpty()) {
                stack.push(ast[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(ast[i])) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(ast[i])) {
                    stack.pop();
                } else {
                    if (stack.isEmpty() || stack.peek() <= 0) {
                        stack.push(ast[i]);
                    }
                }
            }
        }

        List<Integer> ans = new ArrayList<>(stack.size());
        for (int i = 0; i < stack.size(); i++) {
            ans.add(0); 
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            ans.set(i, stack.pop());
        }

        return ans;
    }
}
