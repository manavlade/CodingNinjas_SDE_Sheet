/*
 * Question
 * Program for checking duplicate in an array
 */

import java.util.HashSet;
import java.util.Scanner;

public class Duplica {

    public static boolean check(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
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

        System.out.println(check(arr));
    }
}