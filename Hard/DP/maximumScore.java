package Hard.DP;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class maximumScore {
    /*
     * Question
     * Ninja is playing a board game in which two lists of distinct numbers ‘A’ and
     * ‘B’ arranged in a non-descending order are given. The game has certain rules
     * and the player has to pick some numbers from the given list and the score is
     * the sum of unique picked numbers. The rules are:
     * 1. Choose any list ‘A’ or ‘B’.
     * 2. Traverse from left to right.
     * 3. After picking a number, if the picked number is present in both the
     * arrays, you are allowed to traverse to the other array.
     * You are given arrays,’A’ and ‘B’ of size ‘N’ and ‘M’ respectively. Your task
     * is to find the maximum score Ninja can achieve.
     * 
     * Since the answer can be very large, print answer % (10^9 + 7).
     * For Example
     * If the given array are ‘A’ = [1,3,5,7,9] and ‘B’ = [3,5,100]”.The maximum
     * score can be achieved is 109[1+3+5+100].
     */
    public static int maximumScore(int n, int m, int[] a, int[] b) {
        long mod = 1000000007;
        long sumA = 0;
        long sumB = 0;
        long answer = 0;

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                sumA += a[i++];
            } else if (a[i] > b[j]) {
                sumB += b[j++];
            } else {
                answer += Math.max(sumA, sumB) + a[i];
                answer %= mod;
                sumA = 0;
                sumB = 0;
                i++;
                j++;
            }
        }

        while (i < n) {
            sumA += a[i++];
        }

        while (j < m) {
            sumB += b[j++];
        }

        answer += Math.max(sumA, sumB);
        answer %= mod;

        return (int) answer;
    }

    public int countUniques(int[] a, int k, int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        Set<Integer> sey = new HashSet<>();

        for (int i = 0; i < a.length; i++) {
            int current = a[i];
            if(list.contains(current)){
                if(list.contains(l)){
                    l++;
                    list.add(l);
                }
            }
            else{
                list.add(current);
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(!sey.contains(a[i])){
                sey.add(a[i]);
            }
        }
        return sey.size();
    }
}
