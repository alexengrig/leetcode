from collections import Counter

from task import Task


class Solution(Task):
    def checkInclusion(self, s1: str, s2: str) -> bool:
        len1, len2 = len(s1), len(s2)
        if len1 > len2:
            return False
        expected, counts = Counter(s1), Counter(s2[:len1 - 1])
        l = 0
        for r in range(len1 - 1, len2):
            counts[s2[r]] += 1
            if expected == counts:
                return True
            lc = s2[l]
            counts[lc] -= 1
            if counts[lc] == 0:
                counts.pop(lc)
            l += 1
        return False
