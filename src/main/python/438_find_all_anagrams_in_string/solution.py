from typing import List, Counter

from task import Task


class Solution(Task):
    def findAnagrams(self, s: str, p: str) -> List[int]:
        res = []
        n, m = len(s), len(p)
        if n < m:
            return res
        counts = Counter(p)
        l, size = 0, m
        for r, c in enumerate(s):
            counts[c] -= 1
            if counts[c] >= 0:
                size -= 1
            while size == 0:
                if r - l + 1 == m:
                    res.append(l)
                lc = s[l]
                counts[lc] += 1
                if counts[lc] > 0:
                    size += 1
                l += 1
        return res
