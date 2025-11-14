from collections import Counter
from typing import List

from task import Task


class MapSolution(Task):
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        is_lr = len(nums1) <= len(nums2)
        nums = nums2 if is_lr else nums1
        counts = Counter(nums1 if is_lr else nums2)
        for num in nums:
            if counts[num] > 0:
                res.append(num)
                counts[num] -= 1
        return res
