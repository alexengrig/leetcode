from math import sqrt
from typing import List

from task import Task


class SetSolution(Task):
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        n = len(board)
        size = int(sqrt(n))
        for i in range(n):
            seen_col = set()
            seen_row = set()
            seen_box = set()
            for j in range(n):
                if board[i][j] != '.':
                    if board[i][j] in seen_col:
                        return False
                    seen_col.add(board[i][j])

                if board[j][i] != '.':
                    if board[j][i] in seen_row:
                        return False
                    seen_row.add(board[j][i])

                row = size * (i // size) + j // size
                col = size * (i % size) + j % size
                if board[row][col] != '.':
                    if board[row][col] in seen_box:
                        return False
                    seen_box.add(board[row][col])
        return True
