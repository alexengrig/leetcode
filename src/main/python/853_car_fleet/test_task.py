import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    target = 12
    position = [10, 8, 0, 5, 3]
    speed = [2, 4, 1, 1, 3]
    assert solution.carFleet(target, position, speed) == 3


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    target = 10
    position = [3]
    speed = [3]
    assert solution.carFleet(target, position, speed) == 1


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    target = 100
    position = [0, 2, 4]
    speed = [4, 2, 1]
    assert solution.carFleet(target, position, speed) == 1
