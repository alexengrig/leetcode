import math
from typing import List, Tuple

from task import Task


class IterSolution(Task):
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        if len(nums1) and len(nums2):
            i = l = r = 0
            m, n = len(nums1), len(nums2)
            nums = [0] * (m + n)
            while l < m and r < n:
                if nums1[l] <= nums2[r]:
                    nums[i] = nums1[l]
                    l += 1
                else:
                    nums[i] = nums2[r]
                    r += 1
                i += 1
            while l < m:
                nums[i] = nums1[l]
                i += 1
                l += 1
            while r < n:
                nums[i] = nums2[r]
                i += 1
                r += 1
            return self.findMedian(nums)
        elif len(nums1):
            return self.findMedian(nums1)
        elif len(nums2):
            return self.findMedian(nums2)
        else:
            return 0.0

    def findMedian(self, nums: List[int]) -> float:
        n = len(nums)
        if n % 2 == 0:
            return (nums[n // 2] + nums[n // 2 - 1]) / 2.0
        else:
            return float(nums[n // 2])
