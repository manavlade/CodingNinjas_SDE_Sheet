package Easy;

public class Question2 {
    /*
     * Question
     * A prime number is a positive integer that is divisible by exactly 2 integers,
     * 1 and the number itself.
     * You are given a number 'n'.
     * Find out whether 'n' is prime or not.
     * Example :
     * Input: 'n' = 5
     * Output: YES
     * Explanation: 5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.
     */
    public static String isPrime(int num) {
        if(num == 2){
            return "YES";
        }

        if(num == 1){
            return "NO";
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return "NO";
            }
        }
        return "YES";
    }

}
