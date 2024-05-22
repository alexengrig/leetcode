package dev.alexengrig.leetcode._2906_construct_product_matrix;

class Solution implements Task {
    @Override
    public int[][] constructProductMatrix(int[][] grid) {
        final int n = grid.length;
        final int m = grid[0].length;
        final int k = 12345;
        int[][] results = new int[n][];
        results[0] = new int[m];
        results[0][0] = 1;
        int j = 1, row, col;
        for (int i = 0; i < n; i++) {
            if (i > 0) results[i] = new int[m];
            for (; j < m; j++) {
                if (j > 0) {
                    row = i;
                    col = j - 1;
                } else {
                    row = i - 1;
                    col = m - 1;
                }
                results[i][j] = (int) ((long) results[row][col] * grid[row][col] % k);
            }
            j = 0;
        }
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (j = m - 1; j >= 0; j--) {
                results[i][j] = (int) ((long) results[i][j] * suffix % k);
                suffix = (int) ((long) suffix * grid[i][j] % k);
            }
        }
        return results;
    }
}
