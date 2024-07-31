package BitManipulation;

public class countSetBits {
    /*
     * Question
     * ou are given a number N. Find the total count of set bits for all numbers
     * from 1 to N(both inclusive).
     * IMP NEED TO PRACTICE ONCE
     */
    public static int countSetBits(int n) {
        int ans = 0;
        int bit = 31;
        int temp = n;

        while (bit >= 0) {
            if ((n & (1 << bit)) != 0) {
                ans += bit * (1 << (bit - 1)) + temp - (1 << bit) + 1;
                temp = temp & ~(1 << bit);
            }
            bit--;
        }

        return ans;
    }
}
