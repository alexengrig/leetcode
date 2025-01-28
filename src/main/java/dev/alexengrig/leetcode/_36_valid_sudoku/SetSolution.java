package dev.alexengrig.leetcode._36_valid_sudoku;

import java.util.HashSet;
import java.util.Set;

public class SetSolution implements Task {
    @Override
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int m = (int) Math.sqrt(n);
        for (int i = 0; i < n; i++) {
            Set<Character> rowSet = new HashSet<>();
            Set<Character> colSet = new HashSet<>();
            Set<Character> boxSet = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }
                int row = (i / m) * m + j / m;
                int col = (i % m) * m + j % m;
                if (board[row][col] != '.' && !boxSet.add(board[row][col])) {
                    return false;
                }
            }
        }
        return true;
    }
}
