package Medium.Array;

import java.util.HashMap;

public class subarraySum {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int count = 0;
        int prefixSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if(prefixSum == s){
                count++;
            }
            if(map.containsKey(prefixSum - s)){
                count += prefixSum
            }

        }
    }
}
