from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        node = dummy
        rest = 0
        while l1 or l2 or rest:
            s = rest
            if l1:
                s += l1.val
                l1 = l1.next
            if l2:
                s += l2.val
                l2 = l2.next
            node.next = ListNode(s % 10)
            node = node.next
            rest = s // 10
        return dummy.next
