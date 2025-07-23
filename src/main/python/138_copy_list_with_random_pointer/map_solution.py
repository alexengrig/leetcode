from typing import Optional

from task import Task, Node


class MapSolution(Task):
    def copyRandomList(self, head: 'Optional[Node]') -> 'Optional[Node]':
        dummy = Node(0)
        l = head
        r = dummy
        m = {}
        while l:
            r.next = Node(l.val)
            m[l] = r.next
            r = r.next
            l = l.next
        l = head
        r = dummy.next
        while l:
            if l.random and l.random in m:
                r.random = m.get(l.random)
            r = r.next
            l = l.next
        return dummy.next
