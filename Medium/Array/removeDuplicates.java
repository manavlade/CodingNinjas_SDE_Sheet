package Medium.Array;

import java.util.HashSet;

public class removeDuplicates {
    /*
     * Question
     * You have been given an integer array/list(ARR) of size N which contains
     * numbers from 0 to (N - 2). Each number is present at least once. That is, if
     * N = 5, the array/list constitutes values ranging from 0 to 3 and among these,
     * there is a single integer value that is present twice. You need to find and
     * return that duplicate number present in the array.
     * Note :
     * Duplicate number is always present in the given array/list.
     */
    public static int duplicateNumber(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
            }
            else {
                return arr[i];
            }
        }
        return -1;
    }
}
