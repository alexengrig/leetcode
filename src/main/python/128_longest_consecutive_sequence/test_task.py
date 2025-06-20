import pytest
from set_solution import SetSolution

from task import Task


def provide_solutions() -> list[Task]:
    return [
        SetSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.longestConsecutive([100, 4, 200, 1, 3, 2]) == 4


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.longestConsecutive([0, 3, 7, 2, 5, 8, 4, 6, 0, 1]) == 9


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    assert solution.longestConsecutive([1, 0, 1, 2]) == 3
