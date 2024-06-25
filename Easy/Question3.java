package Easy;

public class Question3 {
    public static boolean isPowerOfTwo(int n) {
        int i = 0;
        while (i <= n) {
            if(Math.pow(n, i) == n){
                return true;
            }
            i++;
        }
        return false;
    }

    //ALTERNATIVE SOLUTION
    // public static boolean isPowerOfTwo(int n) {
    //     if (n <= 0)
    //         return false;
    //     return (n & (n - 1)) == 0;
    // }
}
