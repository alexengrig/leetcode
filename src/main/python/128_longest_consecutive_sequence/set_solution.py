from typing import List

from task import Task


class SetSolution(Task):

    def longestConsecutive(self, nums: List[int]) -> int:
        seen = set(nums)
        res = 0
        for num in seen:
            if num - 1 not in seen:
                l = 1
                while num + l in seen:
                    l += 1
                res = max(res, l)
        return res
