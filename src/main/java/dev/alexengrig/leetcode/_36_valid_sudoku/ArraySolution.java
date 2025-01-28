package dev.alexengrig.leetcode._36_valid_sudoku;

public class ArraySolution implements Task {
    @Override
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = (int) Math.sqrt(n);
        for (int i = 0; i < n; i++) {
            int[] rowCount = new int[n];
            int[] colCount = new int[n];
            int[] boxCount = new int[n];
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.' && ++rowCount[board[i][j] - '1'] > 1) {
                    return false;
                }
                if (board[j][i] != '.' && ++colCount[board[j][i] - '1'] > 1) {
                    return false;
                }
                int row = (i / m) * m + j / m;
                int col = (i % m) * m + j % m;
                if (board[row][col] != '.' && ++boxCount[board[row][col] - '1'] > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
