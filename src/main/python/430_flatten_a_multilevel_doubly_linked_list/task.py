from typing import Optional


class Node:
    def __init__(
            self, val=0,
            next: Optional["Node"] = None,
            prev: Optional["Node"] = None,
            child: Optional["Node"] = None
    ):
        self.val = val
        self.prev = prev
        self.next = next
        self.child = child


class Task:
    def flatten(self, head: Optional[Node]) -> Optional[Node]:
        pass
