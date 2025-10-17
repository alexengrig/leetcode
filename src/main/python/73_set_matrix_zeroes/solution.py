from typing import List

from task import Task


class Solution(Task):
    def setZeroes(self, matrix: List[List[int]]) -> None:
        m, n = len(matrix), len(matrix[0])
        first_row_with_zero = 0 in matrix[0]
        first_col_with_zero = 0 in list(zip(*matrix))[0]
        for i in range(1, m):
            for j in range(1, n):
                if matrix[i][j] == 0:
                    matrix[i][0] = 0
                    matrix[0][j] = 0
        for i in range(1, m):
            if matrix[i][0] == 0:
                for j in range(1, n):
                    matrix[i][j] = 0
        for j in range(1, n):
            if matrix[0][j] == 0:
                for i in range(1, m):
                    matrix[i][j] = 0
        if first_row_with_zero:
            matrix[0] = [0] * n
        if first_col_with_zero:
            for row in matrix:
                row[0] = 0
