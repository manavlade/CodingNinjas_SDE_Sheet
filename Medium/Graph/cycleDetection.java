package Medium.Graph;

import java.util.ArrayList;

public class cycleDetection {
    public static boolean detectCycleInDirectedGraph(int n, ArrayList<ArrayList<Integer>> edges) {
        boolean vis[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (iscycle(i, edges, vis, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean iscycle(int current, ArrayList<ArrayList<Integer>> edges, boolean vis[], int parent) {
        vis[current] = true;

        for (Integer neighbour : edges.get(current)) {
            if (!vis[neighbour]) {
                if (iscycle(neighbour, edges, vis, current)) {
                    return true;
                }
            } else if (parent != neighbour) {
                return true;
            }
        }
        return false;
    }
}
