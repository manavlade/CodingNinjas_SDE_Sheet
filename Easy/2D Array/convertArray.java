public class convertArray {
    /*
     * Question
     * You are given a 0-indexed 1-dimensional (1D) integer array original, and two
     * integers, m and n. You are tasked with creating a 2-dimensional (2D) array
     * with m rows and n columns using all the elements from original.
     * The elements from indices 0 to n - 1 (inclusive) of original should form the
     * first row of the constructed 2D array, the elements from indices n to 2 * n -
     * 1 (inclusive) should form the second row of the constructed 2D array, and so
     * on.
     * Return an m x n 2D array constructed according to the above procedure, or an
     * empty 2D array if it is impossible.
     * Dry run of the code
     * Let's perform a dry run of the corrected `construct2DArray` method using a
     * specific example to illustrate how the code works step-by-step.
     * 
     * ### Example Input
     * - `original = [1, 2, 3, 4]`
     * - `m = 2` (number of rows)
     * - `n = 2` (number of columns)
     * 
     * ### Expected Output
     * - The expected 2D array is `[[1, 2], [3, 4]]`.
     * 
     * ### Dry Run of the Code
     * 
     * 1. **Initialization and Input Check:**
     * - Input: `original = [1, 2, 3, 4]`, `m = 2`, `n = 2`.
     * - Check: `original.length = 4`, `m * n = 4`.
     * - Since `original.length == m * n`, we proceed (condition `if
     * (original.length != m * n)` is false).
     * 
     * 2. **Create the Result Array:**
     * - Create a 2D array `result` with dimensions `m x n`, which is `2 x 2`.
     * - `result` is initialized as `[[0, 0], [0, 0]]`.
     * 
     * 3. **Loop Through Original Array:**
     * 
     * - **Iteration 1: (i = 0)**
     * - `original[0] = 1`
     * - Calculate indices: `row = i / n = 0 / 2 = 0`, `col = i % n = 0 % 2 = 0`.
     * - Set `result[0][0] = 1`.
     * - `result` now looks like `[[1, 0], [0, 0]]`.
     * 
     * - **Iteration 2: (i = 1)**
     * - `original[1] = 2`
     * - Calculate indices: `row = i / n = 1 / 2 = 0`, `col = i % n = 1 % 2 = 1`.
     * - Set `result[0][1] = 2`.
     * - `result` now looks like `[[1, 2], [0, 0]]`.
     * 
     * - **Iteration 3: (i = 2)**
     * - `original[2] = 3`
     * - Calculate indices: `row = i / n = 2 / 2 = 1`, `col = i % n = 2 % 2 = 0`.
     * - Set `result[1][0] = 3`.
     * - `result` now looks like `[[1, 2], [3, 0]]`.
     * 
     * - **Iteration 4: (i = 3)**
     * - `original[3] = 4`
     * - Calculate indices: `row = i / n = 3 / 2 = 1`, `col = i % n = 3 % 2 = 1`.
     * - Set `result[1][1] = 4`.
     * - `result` now looks like `[[1, 2], [3, 4]]`.
     * 
     * 4. **Return the Result Array:**
     * - The final `result` array is `[[1, 2], [3, 4]]`.
     * - The method returns `[[1, 2], [3, 4]]`.
     * 
     * ### Explanation of Each Step:
     * 
     * - **Index Calculation:** The index `i` is used to calculate the row and
     * column for placing the current element in the 2D array. The formula `row = i
     * / n` and `col = i % n` is effective because it maps the flat 1D array index
     * into a 2D grid format.
     * - **Iterating Through the Original Array:** Each element from `original` is
     * placed into the `result` 2D array based on its position, maintaining the
     * sequence.
     * 
     * ### Edge Case Example
     * 
     * Consider an edge case where `m = 1`, `n = 1`, and `original = [1, 2]`. This
     * case demonstrates how the condition to return an empty array is met:
     * 
     * 1. **Check:** `original.length = 2`, `m * n = 1`.
     * 2. Since `original.length != m * n`, return an empty array: `return new
     * int[0][0];`.
     * 
     * This correctly identifies that it is impossible to fit all elements of
     * `original` into a `1 x 1` grid, so the function returns an empty 2D array.
     * 
     * ### Follow-Up Suggestions:
     ** 
     * a.** Test the function with large input sizes to confirm it handles maximum
     * constraints efficiently.
     ** b.** Consider edge cases where either `m` or `n` is 1, or when `original` has
     * a single element, to ensure all cases are handled correctly.
     */
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n) {
            return new int[0][0];
        }
        int[][] result = new int[m][n];
        for (int i = 0; i < original.length; i++) {
            int row = i / n;
            int col = i % n;
            result[row][col] = original[i];
        }
        return result;
    }
}
