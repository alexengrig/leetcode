from typing import List

from task import Task


class Solution(Task):
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        res = 0
        ones = 0
        for num in nums:
            if num == 1:
                ones += 1
                res = max(res, ones)
            else:
                ones = 0
        return res
