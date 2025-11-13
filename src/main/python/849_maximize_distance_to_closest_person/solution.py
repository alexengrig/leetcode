from typing import List

from task import Task


class Solution(Task):
    def maxDistToClosest(self, seats: List[int]) -> int:
        res = 0
        l = -1
        for r, seat in enumerate(seats):
            if seat == 1:
                if l == -1:
                    res = r
                else:
                    res = max(res, (r - l) // 2)
                l = r
        return max(res, len(seats) - l - 1)
