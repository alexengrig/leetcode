import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    A = [1, 3, 2, 4]
    B = [3, 1, 2, 4]
    assert solution.findThePrefixCommonArray(A, B) == [0, 2, 3, 4]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    A = [2, 3, 1]
    B = [3, 1, 2]
    assert solution.findThePrefixCommonArray(A, B) == [0, 1, 3]
