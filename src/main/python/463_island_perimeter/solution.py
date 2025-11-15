from typing import List

from task import Task


class Solution(Task):
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        res = 0
        m, n = len(grid), len(grid[0])
        for i, row in enumerate(grid):
            for j, num in enumerate(row):
                if num == 1:
                    # up
                    if i == 0 or grid[i - 1][j] == 0:
                        res += 1
                    # down
                    if i == m - 1 or grid[i + 1][j] == 0:
                        res += 1
                    # left
                    if j == 0 or row[j - 1] == 0:
                        res += 1
                    # right
                    if j == n - 1 or row[j + 1] == 0:
                        res += 1
        return res
