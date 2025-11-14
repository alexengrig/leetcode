from typing import List

from task import Task


class Solution(Task):
    def summaryRanges(self, nums: List[int]) -> List[str]:
        res: List[str] = []
        i, n = 0, len(nums)
        while i < n:
            begin = nums[i]
            while i + 1 < n and nums[i] == nums[i + 1] - 1:
                i += 1
            end = nums[i]
            if begin == end:
                res.append(str(begin))
            else:
                res.append(str(begin) + '->' + str(end))
            i += 1
        return res
