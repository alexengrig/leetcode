from typing import List

from task import Task


class Solution(Task):
    def isMonotonic(self, nums: List[int]) -> bool:
        n = len(nums)
        is_inc = nums[0] <= nums[n - 1]
        for i in range(1, n):
            if is_inc and nums[i - 1] > nums[i] or not is_inc and nums[i - 1] < nums[i]:
                return False
        return True
