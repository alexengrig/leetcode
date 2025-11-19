import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [5, 7, 7, 8, 8, 10]
    target = 8
    assert solution.searchRange(nums, target) == [3, 4]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [5, 7, 7, 8, 8, 10]
    target = 6
    assert solution.searchRange(nums, target) == [-1, -1]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = []
    target = 0
    assert solution.searchRange(nums, target) == [-1, -1]
