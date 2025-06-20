import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.twoSum([2, 7, 11, 15], 9) == [1, 2]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.twoSum([2, 3, 4], 6) == [1, 3]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    assert solution.twoSum([-1, 0], -1) == [1, 2]
