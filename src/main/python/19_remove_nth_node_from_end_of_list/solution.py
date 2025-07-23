from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        fast = head
        while n > 0:
            fast = fast.next
            n -= 1
        if not fast:
            return head.next
        slow = head
        while fast.next:
            fast = fast.next
            slow = slow.next
        slow.next = slow.next.next
        return head
