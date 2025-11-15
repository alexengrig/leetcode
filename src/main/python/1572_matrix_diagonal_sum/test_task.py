import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    mat = [[1, 2, 3],
           [4, 5, 6],
           [7, 8, 9]]
    assert solution.diagonalSum(mat) == 25


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    mat = [[1, 1, 1, 1],
           [1, 1, 1, 1],
           [1, 1, 1, 1],
           [1, 1, 1, 1]]
    assert solution.diagonalSum(mat) == 8


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    mat = [[5]]
    assert solution.diagonalSum(mat) == 5
