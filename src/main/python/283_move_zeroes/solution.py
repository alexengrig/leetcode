from typing import List

from task import Task


class Solution(Task):
    def moveZeroes(self, nums: List[int]) -> None:
        l = 0
        for r, num in enumerate(nums):
            if num != 0:
                nums[l], nums[r] = nums[r], nums[l]
                l += 1
