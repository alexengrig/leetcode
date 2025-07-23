from typing import Optional

from task import Task, ListNode


class BruteForceSolution(Task):
    def reorderList(self, head: Optional[ListNode]) -> None:
        nodes = []
        node = head
        while node:
            nodes.append(node)
            node = node.next
        l, r = 0, len(nodes) - 1
        while l < r:
            nodes[l].next = nodes[r]
            l += 1
            if l >= r:
                break
            nodes[r].next = nodes[l]
            r -= 1
        nodes[l].next = None
