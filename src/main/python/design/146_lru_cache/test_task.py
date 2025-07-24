from typing import Callable

import pytest

from solution import MyLRUCache
from task import LRUCache


def provide_solutions() -> list[Callable[[int], MyLRUCache]]:
    return [
        lambda capacity: MyLRUCache(capacity),
    ]


def do_test(solution: LRUCache, ops: list[str], inputs: list[list[int]], outputs: list):
    for i, op in enumerate(ops):
        if op is "put":
            solution.put(inputs[i][0], inputs[i][1])
        elif op is "get":
            assert solution.get(inputs[i][0]) == outputs[i]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Callable[[int], MyLRUCache]):
    cache = solution(2)
    ops = ["put", "put", "get", "put", "get", "put", "get", "get", "get"]
    inputs = [[1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
    outputs = [None, None, 1, None, -1, None, -1, 3, 4]
    do_test(cache, ops, inputs, outputs)
