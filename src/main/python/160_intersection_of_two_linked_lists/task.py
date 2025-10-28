from typing import Optional


class ListNode:
    def __init__(self, val=0, next: Optional["ListNode"] = None):
        self.val = val
        self.next = next


class Task:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> Optional[ListNode]:
        pass
