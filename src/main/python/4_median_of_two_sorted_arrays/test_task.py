import pytest

from iter_solution import IterSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        IterSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums1 = [1, 3]
    nums2 = [2]
    assert solution.findMedianSortedArrays(nums1, nums2) == 2.0


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums1 = [1, 2]
    nums2 = [3, 4]
    assert solution.findMedianSortedArrays(nums1, nums2) == 2.5
