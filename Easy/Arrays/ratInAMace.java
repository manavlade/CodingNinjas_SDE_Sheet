package Easy.Arrays;

import java.util.ArrayList;

public class ratInAMace {
    /*
     * Question
     * You are given a starting position for a rat which is stuck in a maze at an
     * initial point (0, 0) (the maze can be thought of as a 2-dimensional plane).
     * The maze would be given in the form of a square matrix of order 'N' * 'N'
     * where the cells with value 0 represent the maze’s blocked locations while
     * value 1 is the open/available path that the rat can take to reach its
     * destination. The rat's destination is at ('N' - 1, 'N' - 1). Your task is to
     * find all the possible paths that the rat can take to reach from source to
     * destination in the maze. The possible directions that it can take to move in
     * the maze are 'U'(up) i.e. (x, y - 1) , 'D'(down) i.e. (x, y + 1) , 'L' (left)
     * i.e. (x - 1, y), 'R' (right) i.e. (x + 1, y).
     * 
     * Note:
     * Here, sorted paths mean that the expected output should be in alphabetical
     * order.
     * For Example:
     * Given a square matrix of size 4*4 (i.e. here 'N' = 4):
     * 1 0 0 0
     * 1 1 0 0
     * 1 1 0 0
     * 0 1 1 1
     * Expected Output:
     * DDRDRR DRDDRR
     * i.e. Path-1: DDRDRR and Path-2: DRDDRR
     * 
     * The rat can reach the destination at (3, 3) from (0, 0) by two paths, i.e.
     * DRDDRR and DDRDRR when printed in sorted order, we get DDRDRR DRDDRR.
     * 
     * IMPORTANT QUESTION ASKED IN MORE THAN 10 COMPANIES: GOOGLE MICROSOFT SAMSUNG
     * IBM GOLDMAN SACHS
     * 
     */
    public static boolean isSafe(int i, int j, int[][] arr, int n, boolean[][] visited) {
        return (i >= 0 && i < n) && (j >= 0 && j < n) && arr[i][j] == 1 && !visited[i][j];
    }

    
    public static void solve(int i, int j, int[][] arr, int n, ArrayList<String> ans, boolean[][] visited,
            String path) {
   
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        visited[i][j] = true;

        if (isSafe(i + 1, j, arr, n, visited)) {
            solve(i + 1, j, arr, n, ans, visited, path + 'D');
        }

        if (isSafe(i, j - 1, arr, n, visited)) {
            solve(i, j - 1, arr, n, ans, visited, path + 'L');
        }

        if (isSafe(i, j + 1, arr, n, visited)) {
            solve(i, j + 1, arr, n, ans, visited, path + 'R');
        }

        if (isSafe(i - 1, j, arr, n, visited)) {
            solve(i - 1, j, arr, n, ans, visited, path + 'U');
        }

        visited[i][j] = false;
    }

    public static ArrayList<String> findSum(int[][] arr, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        String path = "";

        if (arr[0][0] == 1) {
            solve(0, 0, arr, n, ans, visited, path);
        }

        return ans;
    }
}
