from typing import Optional

import pytest

from heap_solution import HeapSolution
from div_and_con_solution import DivideAndConquerSolution
from rec_div_and_con_solution import RecursiveDivideAndConquerSolution
from task import Task, ListNode


def provide_solutions() -> list[Task]:
    return [
        HeapSolution(),
        DivideAndConquerSolution(),
        RecursiveDivideAndConquerSolution(),
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
    lists = [from_list(i) for i in [[1, 4, 5], [1, 3, 4], [2, 6]]]
    assert to_list(solution.mergeKLists(lists)) == [1, 1, 2, 3, 4, 4, 5, 6]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    lists = [from_list(i) for i in []]
    assert to_list(solution.mergeKLists(lists)) == []


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    lists = [from_list(i) for i in [[]]]
    assert to_list(solution.mergeKLists(lists)) == []
