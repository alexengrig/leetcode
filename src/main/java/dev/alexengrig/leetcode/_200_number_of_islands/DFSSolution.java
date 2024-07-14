package dev.alexengrig.leetcode._200_number_of_islands;

import java.util.ArrayDeque;
import java.util.Deque;

class DFSSolution implements Task {
    @Override
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0, n = grid.length; i < n; i++) {
            for (int j = 0, m = grid[i].length; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(char[][] grid, int row, int col) {
        grid[row][col] = '2';
        Deque<int[]> stack = new ArrayDeque<>();
        int[] curr = new int[]{row, col};
        //              up       left     right   down
        int[][] dirs = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        int n = grid.length, m = grid[n - 1].length;
        while (curr != null) {
            int[] next = null;
            for (int[] dir : dirs) {
                int i = curr[0] + dir[0];
                int j = curr[1] + dir[1];
                if (
                        i >= 0 && i < n
                        && j >= 0 && j < m
                        && grid[i][j] == '1'
                ) {
                    grid[i][j] = '2';
                    if (next == null) {
                        next = new int[]{i, j};
                    } else {
                        stack.push(new int[]{i, j});
                    }
                }
            }
            if (next == null && !stack.isEmpty()) {
                curr = stack.pop();
            } else {
                curr = next;
            }
        }
    }
}
