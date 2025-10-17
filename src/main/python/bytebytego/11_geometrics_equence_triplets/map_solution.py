from collections import defaultdict
from typing import List

from task import Task


class MapSolution(Task):
    def geometric_sequence_triplets(self, nums: List[int], r: int) -> int:
        res = 0
        left = defaultdict(int)
        right = defaultdict(int)
        for num in nums:
            right[num] += 1
        for num in nums:
            right[num] -= 1
            if num % r == 0:
                prv = num // r
                nxt = num * r
                res += left[prv] * right[nxt]
            left[num] += 1
        return res
