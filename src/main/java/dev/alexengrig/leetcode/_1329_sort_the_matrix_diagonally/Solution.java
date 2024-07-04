package dev.alexengrig.leetcode._1329_sort_the_matrix_diagonally;

import java.util.Arrays;

class Solution implements Task {
    @Override
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length, m = mat[n - 1].length;
        int[][] res = new int[n][m];
        for (int i = 0; i < n; i++) {
            sort(mat, res, i, 0);
        }
        for (int j = 1; j < m; j++) {
            sort(mat, res, 0, j);
        }
        return res;
    }

    void sort(int[][] mat, int[][] res, int row, int col) {
        int n = mat.length, m = mat[row].length;
        int[] values = new int[Math.min(n - row, m - col)];
        for (int index = 0, i = row, j = col; i < n && j < m; index++, i++, j++) {
            values[index] = mat[i][j];
        }
        Arrays.sort(values);
        for (int index = 0, i = row, j = col; i < n && j < m; index++, i++, j++) {
            res[i][j] = values[index];
        }
    }
}
