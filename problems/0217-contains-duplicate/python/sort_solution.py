# Time: O(n log(n))
# Space: O(1)

from typing import List

from task import Task


class SortSolution(Task):
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums.sort()
        for i in range(1, len(nums)):
            if nums[i - 1] == nums[i]:
                return True
        return False
