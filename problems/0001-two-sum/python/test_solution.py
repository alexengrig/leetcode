import pytest

from map_solution import MapSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        MapSolution()
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.twoSum([2, 7, 11, 15], 9) == [0, 1]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.twoSum([3, 2, 4], 6) == [1, 2]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    assert solution.twoSum([3, 3], 6) == [0, 1]
