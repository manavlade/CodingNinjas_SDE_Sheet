package BitManipulation;

public class numberOfOneBits {
    /*
     * Question
     * Given a positive integer N, print count of set bits in it.
     * N = 6
     * Output:
     * 2
     * Explanation:
     * Binary representation is '110'
     * So the count of the set bit is 2.
     */
    static int setBits(int N) {
        int count = 0;

        while (N > 0) {
            if((N & 1) != 0){
                count++;
            }
            N = N >> 1;
        }
        return count;
    }
}
