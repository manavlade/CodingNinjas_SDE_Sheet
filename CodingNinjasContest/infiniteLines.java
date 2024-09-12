package CodingNinjasContest;

public class infiniteLines {
    /*
     * Question
     * You are given a 2-dimensional infinite coordinate system where each point is
     * represented by a pair of coordinates ('X', 'Y').
     * You are allowed to perform two types of operations on it.
     * In the first type of operation, you can select an integer 'K' and draw an
     * infinite horizontal line whose equation is 'Y' = 'K'.
     * In the second type of operation, you can select an integer 'K' and draw an
     * infinite vertical line whose equation is 'X' = 'K'.
     * There is one more restriction that you cannot perform the first operation
     * more than 'N' times and the second operation more than 'M' times.
     * You are required to determine the maximum number of square shapes of length
     * '1' unit you can make by performing the mentioned operations.
     * Example:
     * N = 2
     * M = 2
     * You can draw two vertical lines with equations 'X' = '0' and 'X = '1' and
     * draw two horizontal lines with equtions 'Y' = '0' and 'Y' = '1'.
     * So, we get one square of length '1' unit with top-right corner at ('1', '1')
     * and bottom-left corner at ('0', '0').
     * It can be proved that you cannot get more than '1' square with given
     * restrictions.
     * So, the answer for this case is '1'.
     * 
     * ***************IMPORTANT*****************
     * Logic:
     * If you draw N horizontal lines, you create N - 1 horizontal gaps between the
     * lines.
     * If you draw M vertical lines, you create M - 1 vertical gaps between the
     * lines.
     * The number of 1x1 squares you can form is the product of the number of gaps
     * formed by the horizontal and vertical lines.
     * Formula: The number of squares is (N - 1) * (M - 1).
     */
    public static int maximumSquares(int n, int m) {
        if (n < 2 || m < 2) {
            return 0;
        }

        return (n - 1) * (m - 1);
    }
}
