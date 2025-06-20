import heapq
from typing import List

from task import Task


class HeapSolution(Task):
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        counts = {}
        for num in nums:
            counts[num] = counts.get(num, 0) + 1
        heap = []
        for num, count in counts.items():
            heapq.heappush(heap, (count, num))
            if len(heap) > k:
                heapq.heappop(heap)
        return [num for _, num in heap]
