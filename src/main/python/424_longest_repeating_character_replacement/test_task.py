import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s = "ABAB"
    k = 2
    assert solution.characterReplacement(s, k) == 4


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    s = "AABABBA"
    k = 1
    assert solution.characterReplacement(s, k) == 4
