import pytest

from solution import MyMinStack
from task import MinStack


def provide_solutions() -> list[MinStack]:
    return [
        MyMinStack(),
    ]


def do_test(solution: MinStack, ops: list[str], inputs: list[list[int]], outputs: list):
    for i, op in enumerate(ops):
        if op is "MinStack":
            return
        elif op is "push":
            solution.push(inputs[i][0])
        elif op is "pop":
            solution.pop()
        elif op is "top":
            assert solution.top() == outputs[i]
        elif op is "getMin":
            assert solution.getMin() == outputs[i]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: MinStack):
    ops = ["MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"]
    inputs = [[], [-2], [0], [-3], [], [], [], []]
    outputs = [None, None, None, None, -3, None, 0, -2]
    do_test(solution, ops, inputs, outputs)
