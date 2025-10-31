from typing import Optional

import pytest

from solution import Solution
from task import Task, ListNode


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


def from_list(vals: list[int]) -> ListNode:
    node = None
    for i in range(len(vals) - 1, -1, -1):
        node = ListNode(vals[i], node)
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
    head = from_list([1, 2, 3, 4, 5])
    assert to_list(solution.middleNode(head)) == [3, 4, 5]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    head = from_list([1, 2, 3, 4, 5, 6])
    assert to_list(solution.middleNode(head)) == [4, 5, 6]
