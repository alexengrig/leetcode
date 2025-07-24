from typing import Optional

import pytest

from brute_force_solution import BruteForceSolution
from task import Task, ListNode


def provide_solutions() -> list[Task]:
    return [
        BruteForceSolution(),
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
    l1 = from_list([2, 4, 3])
    l2 = from_list([5, 6, 4])
    assert to_list(solution.addTwoNumbers(l1, l2)) == [7, 0, 8]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    l1 = from_list([0])
    l2 = from_list([0])
    assert to_list(solution.addTwoNumbers(l1, l2)) == [0]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    l1 = from_list([9, 9, 9, 9, 9, 9, 9])
    l2 = from_list([9, 9, 9, 9])
    assert to_list(solution.addTwoNumbers(l1, l2)) == [8, 9, 9, 9, 0, 0, 0, 1]
