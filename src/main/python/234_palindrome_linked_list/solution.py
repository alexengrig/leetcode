from typing import Optional

from task import Task, ListNode


class Solution(Task):
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next
        prev, curr = None, slow
        while curr:
            tmp = curr.next
            curr.next = prev
            prev = curr
            curr = tmp
        l, r = head, prev
        while l and r:
            if l.val != r.val:
                return False
            l = l.next
            r = r.next
        return True
