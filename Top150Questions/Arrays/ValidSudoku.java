import java.util.HashSet;

/*
 * Question
 You are given a a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:
Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return true if the Sudoku board is valid, otherwise return false

Note: A board does not need to be full or be solvable to be valid.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                char val = board[r][c];
                if (val == '.')
                    continue;

                int boxIndex = (r / 3) * 3 + (c / 3);

                if (rows[r].contains(val) || cols[c].contains(val) || boxes[boxIndex].contains(val)) {
                    return false;
                }

                rows[r].add(val);
                cols[c].add(val);
                boxes[boxIndex].add(val);
            }
        }
        return true;
    }

}
