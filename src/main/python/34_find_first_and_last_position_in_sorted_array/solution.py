from typing import List

from task import Task


class Solution(Task):
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        last = len(nums) - 1

        def search_left() -> int:
            res = -1
            l, r = 0, last
            while l <= r:
                m = l + (r - l) // 2
                if nums[m] < target:
                    l = m + 1
                else:
                    if nums[m] == target:
                        res = m
                    r = m - 1
            return res

        def search_right(begin: int) -> int:
            res = -1
            l, r = begin, last
            while l <= r:
                m = l + (r - l) // 2
                if nums[m] > target:
                    r = m - 1
                else:
                    if nums[m] == target:
                        res = m
                    l = m + 1
            return res

        left = search_left()
        if left == -1:
            return [-1, -1]
        right = search_right(left)
        return [left, right]
