import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s1 = "ab"
    s2 = "eidbaooo"
    assert solution.checkInclusion(s1, s2) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    s1 = "ab"
    s2 = "eidboaoo"
    assert solution.checkInclusion(s1, s2) is False
