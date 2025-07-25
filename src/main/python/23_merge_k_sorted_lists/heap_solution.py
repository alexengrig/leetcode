import heapq
from typing import Optional, List

from task import Task, ListNode


class HeapSolution(Task):
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []
        for head in lists:
            if head is not None:
                heapq.heappush(heap, ComparableNode(head))
        dummy = ListNode()
        node = dummy
        while len(heap):
            min_node = heapq.heappop(heap).node
            if min_node.next is not None:
                heapq.heappush(heap, ComparableNode(min_node.next))
            node.next = min_node
            node = min_node
        return dummy.next


class ComparableNode:
    def __init__(self, node):
        self.node = node

    def __lt__(self, other):
        return self.node.val < other.node.val
