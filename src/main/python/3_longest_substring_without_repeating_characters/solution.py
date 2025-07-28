from task import Task


class Solution(Task):
    def lengthOfLongestSubstring(self, s: str) -> int:
        m = {}
        res = 0
        l = 0
        for r in range(0, len(s)):
            if s[r] in m:
                l = max(l, m[s[r]] + 1)
            m[s[r]] = r
            res = max(res, r - l + 1)
        return res
