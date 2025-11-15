from typing import List

from task import Task


class TwoPointersSolution(Task):
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        res = []
        nums1.sort()
        nums2.sort()
        m, n = len(nums1), len(nums2)
        l, r = 0, 0
        while l < m and r < n:
            if nums1[l] == nums2[r]:
                res.append(nums1[l])
                l += 1
                while l < m and nums1[l - 1] == nums1[l]:
                    l += 1
                r += 1
                while r < n and nums2[r - 1] == nums2[r]:
                    r += 1
            elif nums1[l] < nums2[r]:
                l += 1
                while l < m and nums1[l - 1] == nums1[l]:
                    l += 1
            else:
                r += 1
                while r < n and nums2[r - 1] == nums2[r]:
                    r += 1
        return res
