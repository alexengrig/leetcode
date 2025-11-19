import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 3, 5, 6]
    target = 5
    assert solution.searchInsert(nums, target) == 2


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 3, 5, 6]
    target = 2
    assert solution.searchInsert(nums, target) == 1


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [1, 3, 5, 6]
    target = 7
    assert solution.searchInsert(nums, target) == 4
