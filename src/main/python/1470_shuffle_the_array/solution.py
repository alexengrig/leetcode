from typing import List

from task import Task


class Solution(Task):
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = [0] * len(nums)
        i = 0
        for j in range(n):
            res[i] = nums[j]
            i += 1
            res[i] = nums[n + j]
            i += 1
        return res
