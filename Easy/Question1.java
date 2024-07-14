package Easy;

public class Question1 {
    /*
     * Question
     * You are given two integers 'n', and 'm'.
     * Calculate 'gcd(n,m)', without using library functions.
     * Note:
     * The greatest common divisor (gcd) of two numbers 'n' and 'm' is the largest
     * positive number that divides both 'n' and 'm' without leaving a remainder.
     *  Example:
     * Input: 'n' = 6, 'm' = 4
     */
    public static int calcGCD(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n;
    }
    public static void main(String[] args) {
        calcGCD(10, 20);
    }
}
