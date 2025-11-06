from typing import List

from task import Task


class Solution(Task):
    def containsNearbyAlmostDuplicate(self, nums: List[int], indexDiff: int, valueDiff: int) -> bool:
        buckets = {}

        def get_bucket(value: int) -> int:
            return value // (valueDiff + 1)

        def bucket_contains_duplicate(bucket: int, value: int) -> bool:
            return bucket in buckets and abs(buckets[bucket] - value) <= valueDiff

        for i, num in enumerate(nums):
            b = get_bucket(num)
            if b in buckets or bucket_contains_duplicate(b - 1, num) or bucket_contains_duplicate(b + 1, num):
                return True
            buckets[b] = num
            if i >= indexDiff:
                old_b = get_bucket(nums[i - indexDiff])
                buckets.pop(old_b)
        return False
