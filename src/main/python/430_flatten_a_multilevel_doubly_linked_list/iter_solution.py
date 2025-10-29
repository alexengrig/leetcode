from typing import Optional

from task import Task, Node


class IterativeSolution(Task):
    def flatten(self, head: Optional[Node]) -> Optional[Node]:
        curr = head
        while curr:
            if curr.child:
                nxt = curr.next
                curr.next = curr.child
                curr.child.prev = head
                curr.child = None
                tail = curr.next
                while tail.next:
                    tail = tail.next
                tail.next = nxt
                if nxt:
                    nxt.prev = tail
            curr = curr.next
        return head
