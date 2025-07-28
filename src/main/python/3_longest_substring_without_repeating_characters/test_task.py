import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s = "abcabcbb"
    assert solution.lengthOfLongestSubstring(s) == 3


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    s = "bbbbb"
    assert solution.lengthOfLongestSubstring(s) == 1


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    s = "pwwkew"
    assert solution.lengthOfLongestSubstring(s) == 3
