import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 3, 4, 2, 2]
    assert solution.findDuplicate(nums) == 2


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [3, 1, 3, 4, 2]
    assert solution.findDuplicate(nums) == 3


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [3, 3, 3, 3, 3]
    assert solution.findDuplicate(nums) == 3
