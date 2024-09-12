package Medium.Array;

import java.util.Stack;

public class SubarrayRangeSum {
    
    public static int rangeSum(int[] arr) {
        int n = arr.length;
        Stack<int[]> s = new Stack<>();
        Stack<int[]> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        int mod = (int) 1e9 + 7;

        // Finding min sum
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = 1;
            while (!s.isEmpty() && s.peek()[0] > arr[i]) {
                count += s.peek()[1];
                s.pop();
            }
            s.push(new int[]{arr[i], count});
            left[i] = count;
        }

        for (int i = n - 1; i >= 0; i--) {
            count = 1;
            while (!st.isEmpty() && st.peek()[0] >= arr[i]) {
                count += st.peek()[1];
                st.pop();
            }
            st.push(new int[]{arr[i], count});
            right[i] = count;
        }

        long min = 0;
        for (int i = 0; i < n; i++) {
            min = (min + (long) arr[i] * left[i] * right[i]) % mod;
        }

        // Clear both stacks
        s.clear();
        st.clear();

        // Finding max sum
        for (int i = 0; i < n; i++) {
            count = 1;
            while (!s.isEmpty() && s.peek()[0] < arr[i]) {
                count += s.peek()[1];
                s.pop();
            }
            s.push(new int[]{arr[i], count});
            left[i] = count;
        }

        for (int i = n - 1; i >= 0; i--) {
            count = 1;
            while (!st.isEmpty() && st.peek()[0] <= arr[i]) {
                count += st.peek()[1];
                st.pop();
            }
            st.push(new int[]{arr[i], count});
            right[i] = count;
        }

        long max = 0;
        for (int i = 0; i < n; i++) {
            max = (max + (long) arr[i] * left[i] * right[i]) % mod;
        }

        return (int) ((max - min + mod) % mod);
    }

}
