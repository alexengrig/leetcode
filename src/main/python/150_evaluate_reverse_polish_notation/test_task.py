import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    tokens = ["2", "1", "+", "3", "*"]
    assert solution.evalRPN(tokens) == 9


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    tokens = ["4", "13", "5", "/", "+"]
    assert solution.evalRPN(tokens) == 6


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    tokens = ["10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"]
    assert solution.evalRPN(tokens) == 22
