import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 2, 3, 1]
    indexDiff = 3
    valueDiff = 0
    assert solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [1, 5, 9, 1, 5, 9]
    indexDiff = 2
    valueDiff = 3
    assert solution.containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff) is False
