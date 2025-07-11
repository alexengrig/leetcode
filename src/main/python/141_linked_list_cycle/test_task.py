from typing import Optional

import pytest

from solution import Solution
from task import Task, ListNode


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


def from_list(vals: list[int], cycle_index: int) -> ListNode:
    if not len(vals):
        return None

    last_node = node = ListNode(vals[-1])
    cycle_node = None
    for i in range(len(vals) - 1, -1, -1):
        node = ListNode(vals[i], node)
        if cycle_index == i:
            cycle_node = node
    last_node.next = cycle_node
    return node


def to_list(node: Optional[ListNode]) -> list[int]:
    if not node:
        return []
    vals = []
    curr = node
    while curr:
        vals.append(curr.val)
        curr = curr.next
    return vals


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    head = from_list([3, 2, 0, -4], 1)
    assert solution.hasCycle(head) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    head = from_list([1, 2], 0)
    assert solution.hasCycle(head) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    head = from_list([1], -1)
    assert solution.hasCycle(head) is False
