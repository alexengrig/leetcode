import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [0, 1, 0, 3, 12]
    solution.moveZeroes(nums)
    assert nums == [1, 3, 12, 0, 0]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [0]
    solution.moveZeroes(nums)
    assert nums == [0]
