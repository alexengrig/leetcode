from typing import List

from task import Task


class Solution(Task):
    def generateParenthesis(self, n: int) -> List[str]:
        res: List[str] = []
        builder: List[str] = []

        def backtrack(l: int, r: int):
            if l == 0 == r:
                res.append(''.join(builder))
                return
            if l > 0:
                builder.append('(')
                backtrack(l - 1, r)
                builder.pop()
            if l < r:
                builder.append(')')
                backtrack(l, r - 1)
                builder.pop()

        backtrack(n, n)
        return res
