package Medium.Greedy;

import java.util.Arrays;

public class minimumPlatforms {
    /*
     * Question
     * Given arrival and departure times of all trains that reach a railway station.
     * Find the minimum number of platforms required for the railway station so that
     * no train is kept waiting.
     * Consider that all the trains arrive on the same day and leave on the same
     * day. Arrival and departure time can never be the same for a train but we can
     * have arrival time of one train equal to departure time of the other. At any
     * given instance of time, same platform can not be used for both departure of a
     * train and arrival of another train. In such cases, we need different
     * platforms.
     */
    static int findPlatform(int arr[], int dep[]) {

        int platformCount = 0;
        int maxPlatform = 0;

        int n = arr.length;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 0, j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                platformCount++;
                i++;
            } else {
                platformCount--;
                j++;

            }

            maxPlatform = Math.max(maxPlatform, platformCount);
        }
        return maxPlatform;
    }
}
