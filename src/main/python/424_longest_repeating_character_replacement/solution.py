from collections import Counter, defaultdict

from task import Task


class Solution(Task):
    def characterReplacement(self, s: str, k: int) -> int:
        res = 0
        counts = defaultdict(int)
        max_count = 0
        l = 0
        for r, c in enumerate(s):
            counts[c] += 1
            max_count = max(max_count, counts[c])
            if (r - l + 1) - max_count > k:
                counts[s[l]] -= 1
                l += 1
            res = r - l + 1
        return res
