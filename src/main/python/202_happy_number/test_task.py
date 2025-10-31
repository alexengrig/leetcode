import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    n = 19
    assert solution.isHappy(n) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    n = 2
    assert solution.isHappy(n) is False
