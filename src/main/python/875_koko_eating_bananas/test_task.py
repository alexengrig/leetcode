import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    piles = [3, 6, 7, 11]
    h = 8
    assert solution.minEatingSpeed(piles, h) == 4


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    piles = [30, 11, 23, 4, 20]
    h = 5
    assert solution.minEatingSpeed(piles, h) == 30


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    piles = [30, 11, 23, 4, 20]
    h = 6
    assert solution.minEatingSpeed(piles, h) == 23
