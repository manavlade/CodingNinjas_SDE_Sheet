package BasicMath;

public class Factorial {
    /*
     * Question
     * Given a positive integer, n. Find the factorial of n.
     * Examples :
     * Input: n = 5
     * Output: 120
     * Explanation: 1 x 2 x 3 x 4 x 5 = 120
     */
    static int factorial(int n) {
        int ans = 1;

        if(n == 1 || n == 0){
            return 1;
        }
        while ( n > 1) {
            ans =  ans * n;
            n--;
        }
        return ans;
    }
}
