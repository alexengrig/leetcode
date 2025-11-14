from typing import List

from task import Task


class Solution(Task):
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res ^= num
        return res
