from typing import Optional

from task import Task, Node


class RecursiveSolution(Task):
    def flatten(self, head: Optional[Node]) -> Optional[Node]:
        return self.flat(head, None)

    def flat(self, head: Optional[Node], rest: Optional[Node]) -> Optional[Node]:
        if not head:
            return rest
        head.next = self.flat(head.child, self.flat(head.next, rest))
        if head.next:
            head.next.prev = head
        head.child = None
        return head
