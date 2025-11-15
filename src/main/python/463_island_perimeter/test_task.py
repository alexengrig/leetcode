import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    grid = [[0, 1, 0, 0], [1, 1, 1, 0], [0, 1, 0, 0], [1, 1, 0, 0]]
    assert solution.islandPerimeter(grid) == 16


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    grid = [[1]]
    assert solution.islandPerimeter(grid) == 4


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    grid = [[1, 0]]
    assert solution.islandPerimeter(grid) == 4
