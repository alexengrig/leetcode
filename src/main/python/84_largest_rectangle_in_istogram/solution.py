from typing import List, Tuple

from task import Task


class Solution(Task):
    def largestRectangleArea(self, heights: List[int]) -> int:
        n = len(heights)
        stack: List[int] = []
        max_a = 0
        for i in range(n + 1):
            while len(stack) and (i == n or heights[stack[-1]] > heights[i]):
                h = heights[stack.pop()]
                w = i - stack[-1] - 1 if len(stack) else i
                max_a = max(max_a, h * w)
            stack.append(i)
        return max_a