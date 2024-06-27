package Easy;

public class Question4 {
    /*
     * Question
     * You have been given an integer 'N'.
     * Your task is to return true if it is a power of two. Otherwise, return false.
     * An integer 'N' is a power of two, if it can be expressed as 2 ^ 'K' where 'K'
     * is an integer.
     * For example:
     * 'N' = 4,
     * 4 can be represented as 2^2. So, 4 is the power of two, and hence true is our
     * answer.
     * EXPLAINATION
     * The bitwise AND operation (&) in the isPowerOfTwo method is used to check if
     * a number is a power of two. Here's how it works:
     * If n is a power of two, it will have only one bit set to 1 in its binary
     * representation. For example, 8 in binary is 1000, and 16 in binary is 10000.
     * When you subtract 1 from a power of two, the result will have all the bits
     * set from the least significant bit up to the bit that was set in the original
     * number. For example:
     * 8 - 1 = 7 (binary: 1000 - 1 = 0111)
     * 16 - 1 = 15 (binary: 10000 - 1 = 01111)
     * The bitwise AND operation between n and n - 1 will result in 0 if and only if
     * n is a power of two. This is because the only bit that is set to 1 in n will
     * be cleared to 0 when ANDed with the bits in n - 1.
     * 8 & 7 = 0 (binary: 1000 & 0111 = 0000)
     * 16 & 15 = 0 (binary: 10000 & 01111 = 00000)
     * If n is not a power of two, the bitwise AND operation will not result in 0.
     * For example:
     * 6 & 5 = 4 (binary: 110 & 101 = 100)
     * So, the condition (n & (n - 1)) == 0 will be true if and only if n is a power
     * of two, and false otherwise.
     */
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        return (n & (n-1)) == 0;
    }
}
