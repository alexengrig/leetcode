import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.productExceptSelf([1, 2, 3, 4]) == [24, 12, 8, 6]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.productExceptSelf([-1, 1, 0, -3, 3]) == [0, 0, 9, 0, 0]
