package Easy.Arrays;

import java.util.Scanner;

public class SubArray {
    public static int subArr(int [] arr){
        if(arr.length == 0){
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > sum){
                sum+= arr[i];
            }
            else{
                i++;
            }
        }
        return sum;
    }

    public static String palindrome(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j < array.length; j++) {
                
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        subArr(arr);
        System.out.println(subArr(arr));
    }
}
