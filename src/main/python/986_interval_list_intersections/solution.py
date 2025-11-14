from typing import List

from task import Task


class Solution(Task):
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        res: List[List[int]] = []
        f, s = firstList, secondList
        m, n = len(f), len(s)
        i, j = 0, 0
        while i < m and j < n:
            l, r = f[i], s[j]
            begin, end = max(l[0], r[0]), min(l[1], r[1])
            if begin <= end:
                res.append([begin, end])
            if l[1] <= r[1]:
                i += 1
            else:
                j += 1
        return res
