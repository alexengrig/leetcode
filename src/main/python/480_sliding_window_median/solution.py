import heapq
from collections import defaultdict
from typing import List, Dict

from task import Task


class Solution(Task):
    def medianSlidingWindow(self, nums: List[int], k: int) -> List[float]:
        res: List[float] = []
        lo: List[int] = []  # max heap: -value
        hi: List[int] = []  # min heap:  value
        lo_len, hi_len = 0, 0
        dd: Dict[int, int] = defaultdict(int)  # delete value = count
        is_even = (k % 2 == 0)

        # O(1)
        def median() -> float:
            num = -lo[0]
            if not is_even:
                return num
            else:
                return (num + hi[0]) / 2

        # O(log(k))
        def prune(heap: List[int]) -> None:
            sign = -1 if heap is lo else 1
            while heap and sign * heap[0] in dd:
                num = sign * heapq.heappop(heap)
                dd[num] -= 1
                if dd[num] == 0:
                    dd.pop(num)

        # O(log(k))
        def rebalance() -> None:
            nonlocal lo_len, hi_len
            if lo_len > hi_len + 1:
                heapq.heappush(hi, -heapq.heappop(lo))
                lo_len -= 1
                hi_len += 1
                prune(lo)
            elif lo_len < hi_len:
                heapq.heappush(lo, -heapq.heappop(hi))
                hi_len -= 1
                lo_len += 1
                prune(hi)

        # O(log(k))
        def add(num: int) -> None:
            nonlocal lo_len, hi_len
            if not lo or num <= -lo[0]:
                heapq.heappush(lo, -num)
                lo_len += 1
            else:
                heapq.heappush(hi, num)
                hi_len += 1
            rebalance()

        # O(1) -> O(log(k))
        def remove(num: int) -> None:
            nonlocal lo_len, hi_len
            dd[num] += 1
            if num <= -lo[0]:
                lo_len -= 1
                if num == -lo[0]:
                    prune(lo)
            else:
                hi_len -= 1
                if num == hi[0]:
                    prune(hi)
            rebalance()

        for i in range(k):
            add(nums[i])
        res.append(median())
        for i in range(k, len(nums)):
            add(nums[i])
            remove(nums[i - k])
            res.append(median())
        return res
