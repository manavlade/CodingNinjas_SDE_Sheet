package Medium.Array;

import java.util.Arrays;

public class aggressiveCows {

    /*
     * public static boolean canWePlace(int[]arr,int cow,int i,int x){
     * 
     * int first = 0, second =1;int count =1;
     * 
     * while(second<x){
     * 
     * if(arr[second]-arr[first]>=i){
     * 
     * count++;
     * 
     * if(count ==cow) return true;
     * 
     * first = second;
     * 
     * second +=1;
     * 
     * }else second +=1;
     * 
     * }return false;
     * 
     * }
     * 
     * public static int aggressiveCows(int []stalls, int k) {
     * 
     * // Write your code here.
     * 
     * int n = stalls.length;
     * 
     * Arrays.sort(stalls);
     * 
     * int mini =stalls[0],maxi =stalls[n-1];
     * 
     * for(int j =1;j<=maxi-mini+1;j++){
     * 
     * if(canWePlace(stalls,k,j,n)) continue;
     * 
     * else return j-1;
     * 
     * }return-1;
     * 
     * }
     */

    private static boolean canWePlace(int[] stalls, int numOfCows, int currentPos, int arrLength) {
        int first = 0, second = 1, count = 1;

        while (second < arrLength) {
            if(stalls[second] - stalls[first] >= currentPos){
                count++;

                if(count == numOfCows){ 
                    return true;
                }

                first = second;
                second += 1;
            }
            else {
                second += 1;
            }
        }
        return false;
    }

    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;

        int min = stalls[0];
        int max = stalls[n - 1];

        for (int i = 1; i < max - min + 1; i++) {
            if (canWePlace(stalls, k, i, n)) {
                continue;
            }
            else return i-1;
        }
        return -1;
    }
}
