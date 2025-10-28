import heapq
from typing import Optional, List

from task import Task, ListNode


class HeapSolution(Task):
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []
        for i, head in enumerate(lists):
            if head:
                heapq.heappush(heap, (head.val, i, head))
        dummy = ListNode()
        node = dummy
        while len(heap):
            _, min_index, min_node = heapq.heappop(heap)
            if min_node.next:
                heapq.heappush(heap, (min_node.next.val, min_index + 1, min_node.next))
            node.next = min_node
            node = min_node
        return dummy.next
