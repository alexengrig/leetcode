import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s = "cbaebabacd"
    p = "abc"
    assert solution.findAnagrams(s, p) == [0, 6]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    s = "abab"
    p = "ab"
    assert solution.findAnagrams(s, p) == [0, 1, 2]
