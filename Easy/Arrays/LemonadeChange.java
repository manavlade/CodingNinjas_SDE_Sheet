package Easy.Arrays;

public class LemonadeChange {
    /*
     * Question
     * Ninja is a lemonade seller, and all the lemonade costs 5 rupees for each
     * product. The amount paid by each customer will be 5, 10, or 20 rupees.
     * You are given an array ‘bill’ of length ‘N’, where ‘bill[i]’ represents the
     * amount paid by the ‘i’th customer. You must return the extra amount to the
     * customers in the order they appear in the bill.
     * Given the array ‘bill’, you must return whether or not Ninja can return the
     * correct change to all the customers.
     */
    public static boolean lemonadeChange(int[] bill) {
        int fiveCOunt = 0;
        int tenCount = 0;

        for (int bil : bill) {
            if (bil == 5) {
                fiveCOunt++;
            } else if (bil == 10) {
                if (fiveCOunt == 0) {
                    return false;
                }
                fiveCOunt--;
                tenCount++;
            }

            else {
                if (tenCount > 0 && fiveCOunt > 0) {
                    tenCount--;
                    fiveCOunt--;
                } else if (fiveCOunt >= 3) {
                    fiveCOunt -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
