import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonSequence {
    public static int longestNums(int [] nums, int n ){
        Arrays.sort(nums);

        int [] res = new int[n];

        for(int i = 1; i < n; i++){
            res[i] = nums[i] - nums[i-1];
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if(res[i] == 1){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter The Size of Array");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter The Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(longestNums(arr, n));
    }
}