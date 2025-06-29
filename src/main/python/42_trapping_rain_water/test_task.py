import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
    assert solution.trap(height) == 6


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    height = [4, 2, 0, 3, 2, 5]
    assert solution.trap(height) == 9
