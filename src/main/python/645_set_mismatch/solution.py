from typing import List

from task import Task


class Solution(Task):
    def findErrorNums(self, nums: List[int]) -> List[int]:
        dup = 0
        for i, num in enumerate(nums):
            if nums[abs(num) - 1] < 0:
                dup = abs(num)
            else:
                nums[abs(num) - 1] *= -1
        for i, num in enumerate(nums):
            if num > 0:
                return [dup, i + 1]
        raise ValueError("No solution")
