import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    firstList = [[0, 2], [5, 10], [13, 23], [24, 25]]
    secondList = [[1, 5], [8, 12], [15, 24], [25, 26]]
    expected = [[1, 2], [5, 5], [8, 10], [15, 23], [24, 24], [25, 25]]
    assert solution.intervalIntersection(firstList, secondList) == expected


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    firstList = [[1, 3], [5, 9]]
    secondList = []
    expected = []
    assert solution.intervalIntersection(firstList, secondList) == expected
