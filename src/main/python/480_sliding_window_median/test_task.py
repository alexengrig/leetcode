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
    assert solution.medianSlidingWindow(nums, k) == [1.00000, -1.00000, -1.00000, 3.00000, 5.00000, 6.00000]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 2, 3, 4, 2, 3, 1, 4, 2]
    k = 3
    assert solution.medianSlidingWindow(nums, k) == [2.00000, 3.00000, 3.00000, 3.00000, 2.00000, 3.00000, 2.00000]
