import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 0, -1, 0, -2, 2]
    target = 0
    assert solution.fourSum(nums, target) == [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [2, 2, 2, 2, 2]
    target = 8
    assert solution.fourSum(nums, target) == [[2, 2, 2, 2]]
