import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [-1, 0, 3, 5, 9, 12]
    target = 9
    assert solution.search(nums, target) == 4


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [-1, 0, 3, 5, 9, 12]
    target = 2
    assert solution.search(nums, target) == -1
