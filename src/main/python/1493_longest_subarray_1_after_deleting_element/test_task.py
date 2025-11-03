import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 1, 0, 1]
    assert solution.longestSubarray(nums) == 3


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [0, 1, 1, 1, 0, 1, 1, 0, 1]
    assert solution.longestSubarray(nums) == 5


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [1, 1, 1]
    assert solution.longestSubarray(nums) == 2
