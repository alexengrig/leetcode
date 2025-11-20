from typing import List

from task import Task


class Solution(Task):
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [0] * (n * 2)
        for i in range(n):
            res[i] = res[n + i] = nums[i]
        return res
