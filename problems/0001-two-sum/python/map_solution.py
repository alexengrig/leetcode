# Time: O(n)
# Space: O(n)

from typing import List

from task import Task


class MapSolution(Task):
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen = dict()
        for i, num in enumerate(nums):
            if num in seen:
                return [seen[num], i]
            seen[target - num] = i
        raise ValueError('No solution')
