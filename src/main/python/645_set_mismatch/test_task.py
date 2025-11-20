import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 2, 2, 4]
    assert solution.findErrorNums(nums) == [2, 3]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 1]
    assert solution.findErrorNums(nums) == [1, 2]
