import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
    assert solution.maxArea(height) == 49


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    height = [1, 1]
    assert solution.maxArea(height) == 1
