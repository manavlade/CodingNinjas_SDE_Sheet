package CodingNinjasContest;

import java.util.PriorityQueue;

public class Evaluations {
    public static int minimumTime(int n, int m, int[] v) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            q.add(0);
        }

        for (int i = 0; i < n; i++) {
            int minTime = q.poll();
            minTime += v[i & m];
            q.add(minTime);
        }

        int maxTime = 0;
        while (!q.isEmpty()) {
            maxTime = Math.max(maxTime, q.poll());
        }
        return maxTime;
    }
}
