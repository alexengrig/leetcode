package dev.alexengrig.leetcode._1572_matrix_diagonal_sum;

class Solution implements Task {
    @Override
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length, m = mat[n - 1].length;
        for (int row = 0, l = 0, r = m - 1; row < n; row++, l++, r--) {
            sum += mat[row][l];
            if (l != r) {
                sum += mat[row][r];
            }
        }
        return sum;
    }
}
