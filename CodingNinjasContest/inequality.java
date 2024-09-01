package CodingNinjasContest;

public class inequality {
    /*
     * Question
     * You are given two integers 'X' and 'Y' of 'K' digits where some digits are
     * missing (missing digits are represented by '?').
     * You are required to determine if you can say with certainty that 'X' is
     * strictly greater than 'Y'. If you can, return '1'; otherwise, return '0'. 
     * Note that there can not be leading '0's in 'X' and 'Y'.
     * Example:
     * K = 3
     * X = '2?5'
     * Y = '25?'
     * There is the possibility of 'X' <= 'Y' ('X' = 215 and 'Y' = 253).
     * So, the answer for this case is '0'.
     * Detailed explanation ( Input/output format, Notes, Images )
     * Constraints:
     * 1 <= 'T' <= 10
     * 2 <= 'K' <= 10^5
     * 0 <= 'X[i]' <= 9 or 'X[i]' = '?'.
     * 0 <= 'Y[i]' <= 9 or 'Y[i]' = '?'.
     * It is guaranteed that 'X' and 'Y' will not have any leading '0's.
     * 
     * Time limit: 1 sec
     * Sample input 1:
     * 2
     * 2
     * 1?
     * 10
     * 2
     * 95
     * ?4
     * Sample output 1:
     * 0
     * 1
     * Explanation of sample input 1:
     * For test case 1:
     * There is the possibility of 'X' <= 'Y' ('X' = '10' and 'Y' = '10').
     * So, the answer for this case is '0'.
     * 
     * For test case 2:
     * It can be proved that you cannot have 'X' <= 'Y'. So, 'X' must be strictly
     * greater than 'Y'.
     * So, the answer for this case is '1'.
     * Sample input 2:
     * 2
     * 6
     * ?8?1?0
     * 180100
     * 3
     * 196
     * 169
     * Sample output 2:
     * 0
     * 1
     */
    public static int canYouSay(int k, String x, String y) {
        // Convert the strings to character arrays for easy manipulation
        char[] xArr = x.toCharArray();
        char[] yArr = y.toCharArray();

        for (int i = 0; i < k; i++) {

            if (i == 0 && xArr[0] == '?') {
                xArr[0] = '1';
            }
            if (xArr[i] == '?') {
                xArr[i] = '0';
            }
            if (yArr[i] == '?') {
                yArr[i] = '9';
            }
            if (xArr[i] > yArr[i]) {
                return 1;
            }
            if (xArr[i] < yArr[i]) {
                return 0;
            }
        }
        return 0;
    }
}
