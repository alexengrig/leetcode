from typing import List

from task import Task


class Solution(Task):
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * n

        res[0] = 1
        for i in range(1, n):
            res[i] = res[i - 1] * nums[i - 1]

        suffix = 1
        for i in range(n - 2, -1, -1):
            suffix *= nums[i + 1]
            res[i] *= suffix

        return res
