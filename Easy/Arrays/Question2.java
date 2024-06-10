package Easy.Arrays;

public class Question2 {
    /*
     * Question
     * Given an integer ‘n’, return first n Fibonacci numbers using a generator
     * function.
     */
    
    public static int[] generateFibonacciNumbers(int n) {
        int soln [] = new int[n];
        int a = 0, b = 1;

        for (int i = 0; i < soln.length; i++) {
            soln[i] = a;
            int temp = a;
            a = b;
            b = temp + b;
        }
        return soln;
    }
}
