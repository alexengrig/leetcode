from typing import List

from task import Task


class Solution(Task):
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res: List[int] = [0] * n
        l, r = 0, n - 1
        for i in range(n - 1, -1, -1):
            ls, rs = nums[l] ** 2, nums[r] ** 2
            if ls >= rs:
                res[i] = ls
                l += 1
            else:
                res[i] = rs
                r -= 1
        return res
