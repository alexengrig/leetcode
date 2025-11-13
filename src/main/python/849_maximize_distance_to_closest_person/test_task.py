import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    seats = [1, 0, 0, 0, 1, 0, 1]
    assert solution.maxDistToClosest(seats) == 2


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    seats = [1, 0, 0, 0]
    assert solution.maxDistToClosest(seats) == 3


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    seats = [0, 1]
    assert solution.maxDistToClosest(seats) == 1
