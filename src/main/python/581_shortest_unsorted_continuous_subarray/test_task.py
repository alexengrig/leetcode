import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [2, 6, 4, 8, 10, 9, 15]
    assert solution.findUnsortedSubarray(nums) == 5


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 2, 3, 4]
    assert solution.findUnsortedSubarray(nums) == 0


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [1]
    assert solution.findUnsortedSubarray(nums) == 0
