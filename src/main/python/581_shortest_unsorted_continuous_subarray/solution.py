from typing import List

from task import Task


class Solution(Task):
    def findUnsortedSubarray(self, nums: List[int]) -> int:
        n = len(nums)
        l, r = 0, -1
        mn, mx = nums[n - 1], nums[0]
        for down, up in zip(range(n - 2, -1, -1), range(1, n)):
            if mn < nums[down]:
                l = down
            else:
                mn = nums[down]
            if mx > nums[up]:
                r = up
            else:
                mx = nums[up]
        return r - l + 1
