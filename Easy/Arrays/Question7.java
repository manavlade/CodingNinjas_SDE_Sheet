package Easy.Arrays;

public class Question7 {
    public static int minimumRateToEatBananas(int[] v, int h) {
        int low = 1;
        int high = maxNum(v);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int total = getTotalBananaPerHour(v, mid);

            if (total <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static int getTotalBananaPerHour(int[] v, int hours) {
        int total = 0;

        for (int i = 0; i < v.length; i++) {
            double pile = (double)(v[i]);
            total += Math.ceil(pile / (double)(hours));
        }
        return total;
    }

    public static int maxNum(int[] v) {
        int max = 0;

        for (int i = 0; i < v.length; i++) {
            if (max < v[i]) {
                max = v[i];
            }
        }
        return max;
    }

}
