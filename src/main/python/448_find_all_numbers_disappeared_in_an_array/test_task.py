import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [4, 3, 2, 7, 8, 2, 3, 1]
    assert solution.findDisappearedNumbers(nums) == [5, 6]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 1]
    assert solution.findDisappearedNumbers(nums) == [2]
