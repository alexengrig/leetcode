import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.generateParenthesis(3) == ["((()))", "(()())", "(())()", "()(())", "()()()"]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.generateParenthesis(1) == ["()"]
