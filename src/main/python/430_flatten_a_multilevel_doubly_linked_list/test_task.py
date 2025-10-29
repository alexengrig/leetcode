from typing import Optional

import pytest

from iter_solution import IterativeSolution
from rec_solution import RecursiveSolution
from task import Task, Node


def provide_solutions() -> list[Task]:
    return [
        IterativeSolution(),
        RecursiveSolution(),
    ]


def from_list(vals: list[Optional[int]]) -> Node:
    nxt = None
    for i in range(len(vals) - 1, -1, -1):
        tmp = Node(vals[i], nxt)
        if nxt:
            nxt.prev = tmp
        nxt = tmp
    return nxt


def to_list(node: Optional[Node]) -> list[int]:
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
    l1 = from_list([1, 2, 3, 4, 5, 6])
    l2 = from_list([7, 8, 9, 10])
    l3 = from_list([11, 12])
    l1.next.next.child = l2
    l2.next.child = l3
    head = l1
    assert to_list(solution.flatten(head)) == [1, 2, 3, 7, 8, 11, 12, 9, 10, 4, 5, 6]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    l1 = from_list([1, 2])
    l2 = from_list([3])
    l1.child = l2
    head = l1
    assert to_list(solution.flatten(head)) == [1, 3, 2]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    head = from_list([])
    assert to_list(solution.flatten(head)) == []
