package dev.alexengrig.leetcode._48_rotate_image;

class Solution implements Task {
    @Override
    public void rotate(int[][] matrix) {
        int n = matrix.length, last = n - 1;
        for (int row = 0, rows = n / 2; row < rows; row++) {
            for (int col = 0, cols = rows + n % 2; col < cols; col++) {
                int tmp = matrix[row][col];
                matrix[row][col] = matrix[last - col][row];
                matrix[last - col][row] = matrix[last - row][last - col];
                matrix[last - row][last - col] = matrix[col][last - row];
                matrix[col][last - row] = tmp;
            }
        }
    }
}
