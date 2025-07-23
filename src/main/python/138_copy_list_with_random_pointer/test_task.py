from typing import Optional, Union

import pytest

from map_solution import MapSolution
from task import Task, Node


def provide_solutions() -> list[Task]:
    return [
        MapSolution(),
    ]


def from_list(vals: list[Union[list[Optional[int]], list[int]]]) -> Node:
    node = None
    m = {}
    for i in range(len(vals) - 1, -1, -1):
        val = vals[i][0]
        node = Node(val, node)
        m[i] = node
    head = node
    for i in range(len(vals)):
        random = vals[i][1]
        if random is not None:
            head.random = m.get(random)
        head = head.next
    return node


def to_list(node: Optional[Node]) -> list[Union[list[Optional[int]], list[int]]]:
    if not node:
        return []
    m: dict[Node, int] = {}
    curr = node
    i = 0
    while curr:
        m[curr] = i
        i += 1
        curr = curr.next
    vals = []
    curr = node
    while curr:
        j = None
        if curr.random is not None:
            j = m.get(curr.random)
        vals.append([curr.val, j])
        curr = curr.next
    return vals


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    head = from_list([[7, None], [13, 0], [11, 4], [10, 2], [1, 0]])
    assert to_list(solution.copyRandomList(head)) == [[7, None], [13, 0], [11, 4], [10, 2], [1, 0]]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    head = from_list([[1, 1], [2, 1]])
    assert to_list(solution.copyRandomList(head)) == [[1, 1], [2, 1]]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    head = from_list([[3, None], [3, 0], [3, None]])
    assert to_list(solution.copyRandomList(head)) == [[3, None], [3, 0], [3, None]]
