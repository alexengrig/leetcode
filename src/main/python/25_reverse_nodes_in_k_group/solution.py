from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        tail = dummy
        while True:
            kth = self.get_kth(tail, k)
            if not kth:
                break
            last = kth.next
            prev, curr = kth.next, tail.next
            while curr != last:
                nxt = curr.next
                curr.next = prev
                prev = curr
                curr = nxt
            nxt = tail.next
            tail.next = kth
            tail = nxt
        return dummy.next

    def get_kth(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        while head and k > 0:
            head = head.next
            k -= 1
        return head
