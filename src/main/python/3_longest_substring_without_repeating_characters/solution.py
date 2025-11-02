from task import Task


class Solution(Task):
    def lengthOfLongestSubstring(self, s: str) -> int:
        res = 0
        count = {}
        l = 0
        for r, c in enumerate(s):
            if c in count:
                l = max(l, count[c] + 1)
            count[c] = r
            res = max(res, r - l + 1)
        return res
