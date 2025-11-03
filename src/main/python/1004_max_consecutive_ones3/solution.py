from typing import List, Tuple

from task import Task


class Solution(Task):
    def longestOnes(self, nums: List[int], k: int) -> int:
        res = 0
        l, zeros = 0, 0
        for r, num in enumerate(nums):
            if num == 0:
                zeros += 1
            while zeros > k:
                if nums[l] == 0:
                    zeros -= 1
                l += 1
            res = max(res, r - l + 1)
        return res
