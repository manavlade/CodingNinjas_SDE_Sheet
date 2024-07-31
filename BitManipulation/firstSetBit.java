package BitManipulation;

public class firstSetBit {
    /*
     * Question
     * Given an integer N. The task is to return the position of first set bit found
     * from the right side in the binary representation of the number.
     * Note: If there is no set bit in the integer N, then return 0 from the
     * function.
     * Example
     * N = 18
     * Output:
     * 2
     * Explanation:
     * Binary representation of 18 is 010010,the first set bit from the right side
     * is at position 2.
     * 
     * Dry run
     * n = 18
     * Binary Representation of 18: 10010
     * LSB is at position 1.
     * First set bit is at position 2 (counting from 1).
     * Call getFirstSetBit(18).
     * Check if (n == 0):
     * n is not 0, so proceed.
     * Compute n ^ (n & (n - 1)):
     * n = 18 (binary 10010).
     * n - 1 = 17 (binary 10001).
     * n & (n - 1) = 16 (binary 10000).
     * 18 ^ 16 = 2 (binary 10).
     * Compute Math.log10(2) / Math.log10(2):
     * Math.log10(2) = 0.3010.
     * Math.log10(2) / Math.log10(2) = 1.0.
     * Return (int)(1.0) + 1:
     * 1 + 1 = 2.
     * Output: 2.
     * Test Case 2: n = 0
     * Call getFirstSetBit(0).
     * Check if (n == 0):
     * n is 0, so return 0.
     * Output: 0.
     */
    public static int getFirstSetBit(int n) {
        if(n == 0){
            return 0;
        }

        // using function
        // return Integer.numberOfTrailingZeros(n) + 1;
        return (int) (Math.log10(n ^ (n & (n-1))) / Math.log10(2)) + 1;
    }
}
