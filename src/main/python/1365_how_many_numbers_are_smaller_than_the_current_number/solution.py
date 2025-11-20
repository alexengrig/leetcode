from collections import defaultdict
from typing import List

from task import Task


class Solution(Task):
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        counts = defaultdict(int)
        mx = nums[0]
        for num in nums:
            counts[num] += 1
            mx = max(mx, num)
        for i in range(1, mx):
            counts[i] += counts[i - 1]
        return [0 if num == 0 else counts[num - 1] for num in nums]
