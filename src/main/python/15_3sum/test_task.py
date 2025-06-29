import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [0, 1, 1]
    assert solution.threeSum(nums) == []


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [0, 0, 0]
    assert solution.threeSum(nums) == [[0, 0, 0]]
