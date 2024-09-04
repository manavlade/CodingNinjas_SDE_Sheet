import java.util.Stack;

public class stockSpan {
    /*
     * Question
     * Afzal has been working with an organization called 'Money Traders for the
     * past few years. The organization is in the money trading business. His
     * manager assigned him a task.
     * 
     * 
     * Given an array ’prices’ which denotes stock prices for ’n’ days, e.g.,
     * 'prices[ i ]' = price of the stock at ‘ith’ day, Find the stock's span for
     * each day.
     * The span of the stock's price today is defined as the maximum number of
     * consecutive days(starting from today and going backward) for which the price
     * of the stock was less than today's price.
     * Example:
     * Input: ‘n’ = 7, ‘prices’ = [100, 80, 60, 70, 60, 75, 85]
     * Output: [1, 1, 1, 2, 1, 4, 6]
     * Explanation:
     * On the sixth day, when the stock price was 75,
     * The span came out to be 4 because the last three prices(plus today) were less
     * than the current or the sixth day's price.
     */
    public static int[] findStockSpans(int[] prices) {
        int n = prices.length;
        int[] output = new int[n];

        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && stack.peek()[0] < prices[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                output[i] = i + 1;
            }

            else {
                output[i] = i - stack.peek()[1];
            }
            stack.push(new int[] { prices[i], i });
        }
        return output;
    }
}
