from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        res = ListNode()
        node = res
        l, r = list1, list2
        while l and r:
            if l.val <= r.val:
                node.next = l
                l = l.next
            else:
                node.next = r
                r = r.next
            node = node.next
        node.next = l or r
        return res.next
