from typing import List

from task import Task


class Solution(Task):
    def diagonalSort(self, mat: List[List[int]]) -> List[List[int]]:
        m, n = len(mat), len(mat[0])
        res = [[0] * n for i in range(m)]

        def sort_diagonal(row: int, col: int) -> None:
            size = min(m - row, n - col)
            values = [0] * size
            for i, j, k in zip(range(row, m), range(col, n), range(size)):
                values[k] = mat[i][j]
            values.sort()
            for i, j, k in zip(range(row, m), range(col, n), range(size)):
                res[i][j] = values[k]

        for i in range(m):
            sort_diagonal(i, 0)
        for j in range(n):
            sort_diagonal(0, j)
        return res
