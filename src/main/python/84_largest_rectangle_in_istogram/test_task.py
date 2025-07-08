import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    heights = [2, 1, 5, 6, 2, 3]
    assert solution.largestRectangleArea(heights) == 10


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    heights = [2, 4]
    assert solution.largestRectangleArea(heights) == 4
