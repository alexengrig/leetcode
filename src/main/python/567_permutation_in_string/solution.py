from collections import Counter

from task import Task


class Solution(Task):
    def checkInclusion(self, s1: str, s2: str) -> bool:
        len1, len2 = len(s1), len(s2)
        if len1 > len2:
            return False
        counts = Counter(s1)
        l, size = 0, len1
        for r, c in enumerate(s2):
            counts[c] -= 1
            if counts[c] >= 0:
                size -= 1
            while size == 0:
                if r - l + 1 == len1:
                    return True
                lc = s2[l]
                counts[lc] += 1
                if counts[lc] > 0:
                    size += 1
        return False
