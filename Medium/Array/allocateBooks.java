package Medium.Array;

import java.util.ArrayList;

public class allocateBooks {
     private static boolean canAllocate(ArrayList<Integer> arr, int n, int m, int mid) {
        int studentsRequired = 1; 
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            // If adding this book to the current student exceeds the allowed 'mid' pages
            if (currentSum + arr.get(i) > mid) {
                studentsRequired++; // Assign books to a new student
                currentSum = arr.get(i); // Start sum for new student
                
                if (studentsRequired > m) {
                    return false; // More students required than available
                }
            } else {
                currentSum += arr.get(i);
            }
        }
        return true; // Books can be allocated with the current 'mid' as the maximum pages
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n) {
            return -1; 
        }

        int low = arr.get(0);
        int high = 0;

        // Find low as the maximum single element and high as the total sum
        for (int i = 0; i < n; i++) {
            low = Math.max(low, arr.get(i));
            high += arr.get(i);
        }

        int result = -1;

        // Binary search for the optimal maximum pages
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canAllocate(arr, n, m, mid)) {
                result = mid; // If it's possible, store the result
                high = mid - 1; // Try to find a smaller maximum
            } else {
                low = mid + 1; // If not possible, increase the minimum allowed pages
            }
        }

        return result;
    }
}
