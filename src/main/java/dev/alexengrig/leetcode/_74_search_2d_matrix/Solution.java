package dev.alexengrig.leetcode._74_search_2d_matrix;

class Solution implements Task {
    @Override
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[n - 1].length;
        int row = 0, col = m - 1;
        while (row < n && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return false;
    }
}
