package BasicMath;

public class PerfectNum {

    static boolean isPerfectNumber(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 6 == 0) {
                count += n;
            }
        }
        count -= n;
        if (count == n) {
            return true;
        }
        return false;
    }
}
