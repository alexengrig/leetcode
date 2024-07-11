package dev.alexengrig.leetcode._419_battleships_in_board;

class Solution implements Task {
    @Override
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0, n = board.length; i < n; i++) {
            for (int j = 0, m = board[i].length; j < m; j++) {
                if (board[i][j] == 'X'
                    && (i == 0 || board[i - 1][j] != 'X')
                    && (j == 0 || board[i][j - 1] != 'X')
                ) {
                    count++;
                }
            }
        }
        return count;
    }
}
