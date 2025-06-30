import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s = "()"
    assert solution.isValid(s) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    s = "()[]{}"
    assert solution.isValid(s) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    s = "(]"
    assert solution.isValid(s) is False


@pytest.mark.parametrize("solution", provide_solutions())
def test_3(solution: Task):
    s = "([])"
    assert solution.isValid(s) is True
