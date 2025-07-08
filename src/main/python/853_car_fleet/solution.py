from typing import List, Tuple

from task import Task


class Solution(Task):
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        index: List[int] = [i for i in range(len(position))]
        index.sort(reverse=True, key=lambda i: position[i])
        max_t = 0
        count = 0
        for i in index:
            t = (target - position[i]) / speed[i]
            if max_t < t:
                max_t = t
                count += 1
        return count
