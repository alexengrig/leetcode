package dev.alexengrig.leetcode._463_island_perimeter;

class Solution implements Task {
    @Override
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        for (int i = 0, n = grid.length; i < n; i++) {
            for (int j = 0, m = grid[i].length; j < m; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || grid[i - 1][j] == 0) { // up
                        p++;
                    }
                    if (i == n - 1 || grid[i + 1][j] == 0) { // down
                        p++;
                    }
                    if (j == 0 || grid[i][j - 1] == 0) { // left
                        p++;
                    }
                    if (j == m - 1 || grid[i][j + 1] == 0) { // right
                        p++;
                    }
                }
            }
        }
        return p;
    }
}
