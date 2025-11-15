from typing import List

from task import Task


class MapSolution(Task):
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        is_lr = len(nums1) <= len(nums2)
        nums = nums2 if is_lr else nums1
        seen = set(nums1 if is_lr else nums2)
        for num in nums:
            if num in seen:
                res.append(num)
                seen.remove(num)
        return res
