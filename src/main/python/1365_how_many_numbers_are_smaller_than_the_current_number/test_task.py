import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [8, 1, 2, 2, 3]
    assert solution.smallerNumbersThanCurrent(nums) == [4, 0, 1, 1, 3]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [6, 5, 4, 8]
    assert solution.smallerNumbersThanCurrent(nums) == [2, 1, 0, 3]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [7, 7, 7, 7]
    assert solution.smallerNumbersThanCurrent(nums) == [0, 0, 0, 0]
