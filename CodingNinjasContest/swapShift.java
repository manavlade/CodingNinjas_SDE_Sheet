package CodingNinjasContest;

public class swapShift {
    /*
     * Question
     * You are given a permutation of length 'N' containing elements from '1' to
     * 'N'.
     * Let's define the two types of operations on the permutation.
     * In operation-1, you can select the indices 'i' and 'j' ('i' < 'j') and swap
     * 'P[i]' and 'P[j]'.
     * In operation-2, you can perform a left shift on the permutation. For example,
     * ['1', '2', '3'] becomes ['2', '3', '1'].
     * First you have to perform the operation-1 on the permutation exactly once.
     * Then you have to perform the operation-2 on the permutation any number of
     * times.
     * Determine whether the permutation 'P' can become sorted after performing the
     * operations as mentioned. Return '1' in that case. Otherwise, return '0'.
     * Example:
     * N = 3
     * P = [3, 2, 1]
     * First you will choose indices '0' and '1' and perform operation-1. So, the
     * resulting permutation is ['2', '3', '1']. Note that we are using 0-based
     * indexing.
     * Then you will perform operation-2 two times. So, the resulting permutation is
     * ['1', '2', '3'] which is sorted.
     * So, the answer for this case is '1'.
     */
    private static boolean check(int index, int[] p) {
        int n = p.length, count = 0;

        for (int i = 0; i < n; i++) {
            if ((p[i] - p[index] + n) % n != (i - index + n) % n) {
                count++;
            }
        }
        return (count == 2);
    }

    public static int canYouSort(int n, int[] p) {
        if (n <= 2) {
            return 1;
        }

        int answer = Math.max(check(0, p) ? 1 : 0, Math.max(check(1, p) ? 1 : 0, check(2, p) ? 1 : 0));

        return answer;
    }
}
