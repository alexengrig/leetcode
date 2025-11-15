from typing import List

from task import Task


class Solution(Task):
    def diagonalSum(self, mat: List[List[int]]) -> int:
        res = 0
        n = len(mat)
        for i in range(n):
            res += mat[i][i]
            j = n - 1 - i
            if j != i:
                res += mat[i][j]
        return res
