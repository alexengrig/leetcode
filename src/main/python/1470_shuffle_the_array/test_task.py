import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [2, 5, 1, 3, 4, 7]
    n = 3
    assert solution.shuffle(nums, n) == [2, 3, 5, 4, 1, 7]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 2, 3, 4, 4, 3, 2, 1]
    n = 4
    assert solution.shuffle(nums, n) == [1, 4, 2, 3, 3, 2, 4, 1]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [1, 1, 2, 2]
    n = 2
    assert solution.shuffle(nums, n) == [1, 2, 1, 2]
