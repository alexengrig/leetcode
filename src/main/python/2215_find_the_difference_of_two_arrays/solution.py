from typing import List

from task import Task


class Solution(Task):
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        res = []
        dist = []
        seen = set(nums2)
        for num in nums1:
            if num not in seen:
                dist.append(num)
                seen.add(num)
        res.append(dist)
        dist = []
        seen = set(nums1)
        for num in nums2:
            if num not in seen:
                dist.append(num)
                seen.add(num)
        res.append(dist)
        return res
