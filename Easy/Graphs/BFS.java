package Easy.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    /*
     * Question
     * Given an adjacency list representation of a directed graph with ‘n’ vertices
     * and ‘m’ edges. Your task is to return a list consisting of Breadth-First
     * Traversal (BFS) starting from vertex 0.
     * 
     * 
     * 
     * In this traversal, one can move from vertex 'u' to vertex 'v' only if there
     * is an edge from 'u' to 'v'. The BFS traversal should include all nodes
     * directly or indirectly connected to vertex 0.
     * Note:
     * The traversal should proceed from left to right according to the input
     * adjacency list.
     * Example:
     * Adjacency list: { {1,2,3},{4}, {5}, {},{},{}}
     * 
     * The interpretation of this adjacency list is as follows:
     * Vertex 0 has directed edges towards vertices 1, 2, and 3.
     * Vertex 1 has a directed edge towards vertex 4.
     * Vertex 2 has a directed edge towards vertex 5.
     * Vertices 3, 4, and 5 have no outgoing edges.
     * We can also see this in the diagram below.
     * BFS traversal: 0 1 2 3 4 5 
     * IMPORTANT: GOOGLE AMAZON FLIPKART
     */
    public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean vis[] = new boolean[adj.size()];

        Queue<Integer> queue = new LinkedList<>();

        vis[0] = true;
        queue.offer(0);
        bfs.add(0);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int neighbour : adj.get(curr)) {
                if (!vis[neighbour]) {
                    vis[neighbour] = true;
                    queue.offer(neighbour);
                    bfs.add(neighbour);
                }
            }

        }
        return bfs;
    }
}
