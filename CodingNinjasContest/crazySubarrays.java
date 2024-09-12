package CodingNinjasContest;

import java.util.HashMap;

public class crazySubarrays {
    /*
     * Question
     * You are given an array ‘A’ of ‘N’ integers numbered from ‘0’ to ‘N - 1’. A
     * subarray from index ‘i’ to ‘j’ is referred to as a crazy subarray if it
     * contains any element ‘X’ which occurs at least ‘K’ times.
     * You have to count all the crazy subarrays of the given array ‘A’.
     * Your task is to count all the crazy subarrays of the given array ‘A’ and
     * return it.
     * Example:
     * ‘N’ = 5
     * ‘K’ = 2
     * ‘A’ = [1, 5, 2, 5, 2]
     * The crazy subarrays of the given array ‘A’ are: ‘[5, 2, 5]’, ‘[1, 5, 2, 5]’,
     * ‘[2, 5, 2]’, ‘[5, 2, 5, 2]’, and ‘[1, 5, 2, 5, 2]’.
     * So, the count is equal to ‘5’.
     */
    public static long crazySubarrays(int n, int k, int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        long result = 0;


        for (int right = 0; right < a.length; right++) {
            map.put(a[right], map.getOrDefault(a[right], 0) + 1);

            while(map.getOrDefault(a[right], 0) >= k){
                result += n - right;

                map.put(a[left], map.get(a[left])-1);

                if(map.get(a[left]) == 0){
                    map.remove(a[left]);
                }
                left++;
            }
        }

        return result;
    }
}
