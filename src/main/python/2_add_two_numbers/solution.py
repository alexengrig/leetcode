from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        node = dummy
        rest = 0
        while l1 and l2:
            s = l1.val + l2.val + rest
            val = s % 10
            rest = s // 10
            node.next = ListNode(val)
            node = node.next
            l1 = l1.next
            l2 = l2.next
        while l1:
            s = l1.val + rest
            val = s % 10
            rest = s // 10
            node.next = ListNode(val)
            node = node.next
            l1 = l1.next
        while l2:
            s = l2.val + rest
            val = s % 10
            rest = s // 10
            node.next = ListNode(val)
            node = node.next
            l2 = l2.next
        if rest:
            node.next = ListNode(rest)
        return dummy.next

