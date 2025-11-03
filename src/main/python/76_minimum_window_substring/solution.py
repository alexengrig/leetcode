from collections import Counter

from task import Task


class Solution(Task):
    def minWindow(self, s: str, t: str) -> str:
        n, m = len(s), len(t)
        if n < m:
            return ""
        counts = Counter(t)
        l, size = 0, m
        min_l, min_size = -1, n + 1
        for r, c in enumerate(s):
            counts[c] -= 1
            if counts[c] >= 0:
                size -= 1
            while size == 0:
                if min_size > r - l + 1:
                    min_l = l
                    min_size = r - l + 1
                lc = s[l]
                counts[lc] += 1
                if counts[lc] > 0:
                    size += 1
                l += 1
        return "" if min_l == -1 else s[min_l:min_l + min_size]
