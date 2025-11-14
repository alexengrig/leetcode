from typing import List

from task import Task


class Solution(Task):
    def findThePrefixCommonArray(self, A: List[int], B: List[int]) -> List[int]:
        res = []
        n = len(A)
        counts = [0] * (n + 1)
        prefix = 0
        for l, r in zip(A, B):
            counts[l] += 1
            if counts[l] == 2:
                prefix += 1
            counts[r] += 1
            if counts[r] == 2:
                prefix += 1
            res.append(prefix)
        return res
