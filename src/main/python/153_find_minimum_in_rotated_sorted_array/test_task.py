import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [3, 4, 5, 1, 2]
    assert solution.findMin(nums) == 1


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [4, 5, 6, 7, 0, 1, 2]
    assert solution.findMin(nums) == 0


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [11, 13, 15, 17]
    assert solution.findMin(nums) == 11
