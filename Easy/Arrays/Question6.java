package Easy.Arrays;

import java.util.HashMap;

public class Question6 {
    public static int getLongestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,-1);

        int sum = 0;
        int arrLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(sum == k) {
                arrLength = i + 1;
            }

            if(map.containsKey(sum-k)){
                arrLength = Math.max(arrLength, i - map.get(sum - k));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return arrLength;
    }
    
}
