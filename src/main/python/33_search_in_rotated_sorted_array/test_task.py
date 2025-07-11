import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [4, 5, 6, 7, 0, 1, 2]
    target = 0
    assert solution.search(nums, target) == 4


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [4, 5, 6, 7, 0, 1, 2]
    target = 3
    assert solution.search(nums, target) == -1


@pytest.mark.parametrize("solution", provide_solutions())
def test_3(solution: Task):
    nums = [1]
    target = 0
    assert solution.search(nums, target) == -1
