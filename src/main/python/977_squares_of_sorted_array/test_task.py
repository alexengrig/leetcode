import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [-4, -1, 0, 3, 10]
    assert solution.sortedSquares(nums) == [0, 1, 9, 16, 100]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [-7, -3, 2, 3, 11]
    assert solution.sortedSquares(nums) == [4, 9, 9, 49, 121]
