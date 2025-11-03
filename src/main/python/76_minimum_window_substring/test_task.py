import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s = "ADOBECODEBANC"
    t = "ABC"
    assert solution.minWindow(s, t) == "BANC"


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    s = "a"
    t = "a"
    assert solution.minWindow(s, t) == "a"


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    s = "a"
    t = "aa"
    assert solution.minWindow(s, t) == ""
