import heapq
from typing import Optional, List

from task import Task, ListNode


class RecursiveDivideAndConquerSolution(Task):
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if lists is None or len(lists) == 0:
            return None
        return self.divide(lists, 0, len(lists) - 1)

    def divide(self, lists: List[Optional[ListNode]], l: int, r: int) -> Optional[ListNode]:
        if l > r:
            return None
        if l == r:
            return lists[l]
        mid = l + (r - l) // 2
        left = self.divide(lists, l, mid)
        right = self.divide(lists, mid + 1, r)
        return self.conquer(left, right)

    def conquer(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> ListNode:
        dummy = ListNode()
        tail = dummy
        while l1 and l2:
            if l1.val < l2.val:
                tail.next = l1
                l1 = l1.next
            else:
                tail.next = l2
                l2 = l2.next
            tail = tail.next
        if l1:
            tail.next = l1
        if l2:
            tail.next = l2
        return dummy.next
