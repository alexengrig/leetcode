from typing import Union

import pytest

from solution import MyTimeMap
from task import TimeMap


def provide_solutions() -> list[TimeMap]:
    return [
        MyTimeMap(),
    ]


def do_test(solution: TimeMap, ops: list[str], inputs: list[list[Union[str, int]]], outputs: list):
    for i, op in enumerate(ops):
        if op is "TimeMap":
            return
        elif op is "set":
            solution.set(inputs[i][0], inputs[i][1], inputs[i][2])
        elif op is "get":
            assert solution.get(inputs[i][0], inputs[i][1]) == outputs[i]
        else:
            raise ValueError("Unexpected operation:", op)


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: TimeMap):
    ops = ["TimeMap", "set", "get", "get", "set", "get", "get"]
    inputs = [[], ["foo", "bar", 1], ["foo", 1], ["foo", 3], ["foo", "bar2", 4], ["foo", 4], ["foo", 5]]
    outputs = [None, None, "bar", "bar", None, "bar2", "bar2"]
    do_test(solution, ops, inputs, outputs)
