import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums1 = [1, 2, 3]
    nums2 = [2, 4, 6]
    assert solution.findDifference(nums1, nums2) == [[1, 3], [4, 6]]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums1 = [1, 2, 3, 3]
    nums2 = [1, 1, 2, 2]
    assert solution.findDifference(nums1, nums2) == [[3], []]
