package Hard.DP;

import java.util.Arrays;

public class travellingSalesman {
    /*
     * Question
     * Given a list of cities numbered from 0 to N-1 and a matrix 'DISTANCE'
     * consisting of 'N' rows and 'N' columns denoting the distances between each
     * pair of cities, what is the shortest possible route that visits each city
     * exactly once and returns to the starting city?
     * 
     * 
     * Dry run of code along with explaination
     * Sure, let's break down the code with an emphasis on the bitmasking part,
     * followed by a dry run with a sample input.
     * 
     * ### Code Explanation
     * 
     * #### Initialization
     * ```java
     * static final int INF = Integer.MAX_VALUE;
     * ```
     * - `INF` is defined as the maximum integer value, representing an infinite
     * distance.
     * 
     * #### `tsp` Function
     * ```java
     * public static int tsp(int[][] cost, int start, int mask, int[][] dp) {
     * int n = cost.length;
     * 
     * if (mask == (1 << n) - 1)
     * return cost[start][0];
     * 
     * if (dp[start][mask] != -1)
     * return dp[start][mask];
     * 
     * int ans = INF;
     * 
     * for (int nextCity = 0; nextCity < n; nextCity++) {
     * if ((mask & (1 << nextCity)) == 0) {
     * int newMask = mask | (1 << nextCity);
     * ans = Math.min(ans, cost[start][nextCity] + tsp(cost, nextCity, newMask,
     * dp));
     * }
     * }
     * 
     * return dp[start][mask] = ans;
     * }
     * ```
     * - **Parameters**:
     * - `cost`: Matrix representing distances between cities.
     * - `start`: Current city.
     * - `mask`: Bitmask representing the set of visited cities.
     * - `dp`: Memoization table.
     * 
     * - **Base Case**:
     * ```java
     * if (mask == (1 << n) - 1)
     * return cost[start][0];
     * ```
     * - If all cities are visited (`mask == (1 << n) - 1`), return the cost to go
     * back to the starting city.
     * 
     * - **Memoization**:
     * ```java
     * if (dp[start][mask] != -1)
     * return dp[start][mask];
     * ```
     * - If the result for the current state is already computed, return it.
     * 
     * - **Recursive Case**:
     * ```java
     * for (int nextCity = 0; nextCity < n; nextCity++) {
     * if ((mask & (1 << nextCity)) == 0) {
     * int newMask = mask | (1 << nextCity);
     * ans = Math.min(ans, cost[start][nextCity] + tsp(cost, nextCity, newMask,
     * dp));
     * }
     * }
     * ```
     * - For each city, if it is not visited (`(mask & (1 << nextCity)) == 0`),
     * calculate the new bitmask (`newMask = mask | (1 << nextCity)`) representing
     * visiting the next city, and recursively compute the cost.
     * 
     * #### `shortestRoute` Function
     * ```java
     * public static int shortestRoute(int[][] distance) {
     * int n = distance.length;
     * int[][] dp = new int[n][1 << n];
     * for (int i = 0; i < n; i++)
     * Arrays.fill(dp[i], -1);
     * 
     * return tsp(distance, 0, 1, dp);
     * }
     * ```
     * - **Initialization**:
     * - `dp` table is initialized with `-1` to denote uncomputed states.
     * - **Start the TSP from the first city** with `mask = 1` (binary `0001`),
     * indicating only the first city is visited.
     * 
     * ### Bitmasking Explanation
     * 
     * - **Bitmask Representation**:
     * - Each bit in the `mask` represents whether a city is visited.
     * - `mask = 1` (binary `0001`): Only city 0 is visited.
     * - `mask = 3` (binary `0011`): Cities 0 and 1 are visited.
     * - `mask = 7` (binary `0111`): Cities 0, 1, and 2 are visited.
     * 
     * - **Operations**:
     * - **Check if a city is visited**: `(mask & (1 << nextCity)) == 0`
     * - If the `nextCity` bit is not set in `mask`, it means `nextCity` is not
     * visited.
     * - **Update the mask**: `newMask = mask | (1 << nextCity)`
     * - Set the `nextCity` bit in `mask` to mark `nextCity` as visited.
     * 
     * ### Dry Run
     ** 
     * Sample Input**:
     * ```plaintext
     * 2
     * 4
     * 0 20 42 25
     * 20 0 30 34
     * 42 30 0 10
     * 25 34 10 0
     * ```
     * 
     * #### Initialization
     * 
     * 1. **Input Parsing**:
     * - `n = 4`
     * - `distance = [[0, 20, 42, 25], [20, 0, 30, 34], [42, 30, 0, 10], [25, 34,
     * 10, 0]]`
     * 
     * 2. **DP Table**:
     * - Initialize `dp` table with `-1`.
     * 
     * #### Recursive TSP Calculation
     * 
     * 1. **Start from city 0 with `mask = 1` (binary `0001`)**:
     * ```java
     * tsp(distance, 0, 1, dp)
     * ```
     * 
     * 2. **Current state**: `start = 0`, `mask = 1`
     * - All cities visited: `false` (`mask != 1111`)
     * - DP value exists: `false`
     * 
     * 3. **Try visiting next city**:
     * - `nextCity = 1` (`mask = 0011`)
     * ```java
     * newMask = 1 | 1 << 1 = 0011
     * tsp(distance, 1, 3, dp)
     * ```
     * - Cost: `20 + tsp(distance, 1, 3, dp)`
     * 
     * 4. **Current state**: `start = 1`, `mask = 3`
     * - All cities visited: `false`
     * - DP value exists: `false`
     * 
     * 5. **Try visiting next city**:
     * - `nextCity = 2` (`mask = 0111`)
     * ```java
     * newMask = 3 | 1 << 2 = 0111
     * tsp(distance, 2, 7, dp)
     * ```
     * - Cost: `30 + tsp(distance, 2, 7, dp)`
     * 
     * 6. **Current state**: `start = 2`, `mask = 7`
     * - All cities visited: `false`
     * - DP value exists: `false`
     * 
     * 7. **Try visiting next city**:
     * - `nextCity = 3` (`mask = 1111`)
     * ```java
     * newMask = 7 | 1 << 3 = 1111
     * tsp(distance, 3, 15, dp)
     * ```
     * - Cost: `10 + tsp(distance, 3, 15, dp)`
     * 
     * 8. **Current state**: `start = 3`, `mask = 15`
     * - All cities visited: `true`
     * ```java
     * return distance[3][0] = 25
     * ```
     * 
     * 9. **Backtrack and compute costs**:
     * - `tsp(distance, 2, 7, dp) = 10 + 25 = 35`
     * - `tsp(distance, 1, 3, dp) = 30 + 35 = 65`
     * - `tsp(distance, 0, 1, dp) = 20 + 65 = 85`
     * 
     * 10. **Final Result**:
     * ```java
     * shortestRoute(distance) = 85
     * ```
     * 
     * ### Summary
     * - This code uses dynamic programming and bitmasking to solve the Traveling
     * Salesman Problem efficiently for small `N` (up to 16).
     * - Bitmasking helps in representing subsets of cities visited and
     * transitioning between states while computing the minimum cost tour.
     ** 
     * a.** Add comments to improve code readability.
     ** b.** Implement an iterative version to compare performance.
     */
    static final int INF = Integer.MAX_VALUE;

    public static int tsp(int[][] cost, int start, int mask, int[][] dp ){
        int n = cost.length;
        if(mask == (1 << n) - 1){
            return cost[start][0];
        }

        if(dp[start][mask] != -1){
            return dp[start][mask];
        }
        
        int ans = INF;

        for (int i = 0; i < n; i++) {
            if((mask & (1 << i)) == 0){
                int newMask = mask | (1 << i);

                ans = Math.min(ans, cost[start][i] + tsp(cost, i, newMask, dp));
            }
        }
        return dp[start][mask] = ans;
    }

    public static int shortestRoute(int[][] distance) {
        int n = distance.length;

        int dp [][] = new int[n][1 << n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return tsp(distance, 0, 1, dp);
    }

}
