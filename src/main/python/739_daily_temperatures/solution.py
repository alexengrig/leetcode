from typing import List, Tuple

from task import Task


class Solution(Task):
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res: List[int] = [0] * len(temperatures)
        stack: List[Tuple[int, int]] = []

        for i, t in enumerate(temperatures):
            while len(stack) and t > stack[-1][0]:
                _, j = stack.pop()
                res[j] = i - j

            stack.append((t, i))

        return res
