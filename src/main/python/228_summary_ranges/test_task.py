import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [0, 1, 2, 4, 5, 7]
    assert solution.summaryRanges(nums) == ["0->2", "4->5", "7"]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [0, 2, 3, 4, 6, 8, 9]
    assert solution.summaryRanges(nums) == ["0", "2->4", "6", "8->9"]
