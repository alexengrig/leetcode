import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 2, 2, 3]
    assert solution.isMonotonic(nums) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [6, 5, 4, 4]
    assert solution.isMonotonic(nums) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [1, 3, 2]
    assert solution.isMonotonic(nums) is False
