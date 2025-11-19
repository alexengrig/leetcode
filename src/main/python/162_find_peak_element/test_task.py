import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 2, 3, 1]
    assert solution.findPeakElement(nums) == 2


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 2, 1, 3, 5, 6, 4]
    assert solution.findPeakElement(nums) == 5
