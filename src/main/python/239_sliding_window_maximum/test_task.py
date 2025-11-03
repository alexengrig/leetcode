import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 3, -1, -3, 5, 3, 6, 7]
    k = 3
    assert solution.maxSlidingWindow(nums, k) == [3, 3, 5, 5, 6, 7]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1]
    k = 1
    assert solution.maxSlidingWindow(nums, k) == [1]
