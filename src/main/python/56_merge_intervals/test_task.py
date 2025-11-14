import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    intervals = [[1, 3], [2, 6], [8, 10], [15, 18]]
    assert solution.merge(intervals) == [[1, 6], [8, 10], [15, 18]]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    intervals = [[1, 4], [4, 5]]
    assert solution.merge(intervals) == [[1, 5]]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    intervals = [[4, 7], [1, 4]]
    assert solution.merge(intervals) == [[1, 7]]
