from typing import List

from task import Task


class Solution(Task):
    def longestSubarray(self, nums: List[int]) -> int:
        res = 0
        l, z = 0, -1
        for r, num in enumerate(nums):
            if num == 0:
                l = z + 1
                z = r
            res = max(res, (r - l + 1) - 1)
        return res
