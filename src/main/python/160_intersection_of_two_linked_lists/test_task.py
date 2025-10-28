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


def join_list(left: ListNode, left_skip: int, right: ListNode, right_skip: int) -> None:
    l, r = left, right
    i = 1
    while i != left_skip:
        l = l.next
        i += 1
    i = 1
    while i != right_skip:
        r = r.next
        i += 1
    r.next = l.next


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
    head_a = from_list([4, 1, 8, 4, 5])
    head_b = from_list([5, 6, 1, 8, 4, 5])
    join_list(head_a, 2, head_b, 3)
    assert solution.getIntersectionNode(head_a, head_b).val == 8


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    head_a = from_list([1, 9, 1, 2, 4])
    head_b = from_list([3, 2, 4])
    join_list(head_a, 3, head_b, 1)
    assert solution.getIntersectionNode(head_a, head_b).val == 2


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    head_a = from_list([2, 6, 4])
    head_b = from_list([1, 5])
    join_list(head_a, 3, head_b, 2)
    assert solution.getIntersectionNode(head_a, head_b) is None
