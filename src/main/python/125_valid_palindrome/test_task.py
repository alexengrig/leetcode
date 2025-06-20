import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.isPalindrome("A man, a plan, a canal: Panama") is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.isPalindrome("race a car") is False


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    assert solution.isPalindrome(" ") is True
