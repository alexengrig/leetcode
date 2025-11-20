import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 2, 1]
    assert solution.getConcatenation(nums) == [1, 2, 1, 1, 2, 1]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 3, 2, 1]
    assert solution.getConcatenation(nums) == [1, 3, 2, 1, 1, 3, 2, 1]
