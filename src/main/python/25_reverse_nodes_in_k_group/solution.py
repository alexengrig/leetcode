from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def reverseKGroup(self, head: Optional[ListNode], k: int) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        tail = dummy
        while True:
            kth = self.find_kth(tail, k)
            if not kth:
                break
            self.reverse(tail.next, kth.next)
            nxt = tail.next
            tail.next = kth
            tail = nxt
        return dummy.next

    def find_kth(self, head: ListNode, k: int) -> Optional[ListNode]:
        while head and k > 0:
            head = head.next
            k -= 1
        return head

    def reverse(self, head: ListNode, last: ListNode) -> None:
        prev, curr = last, head
        while curr != last:
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
