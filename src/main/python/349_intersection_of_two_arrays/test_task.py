import pytest

from map_solution import MapSolution
from twop_solution import TwoPointersSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        MapSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums1 = [1, 2, 2, 1]
    nums2 = [2, 2]
    assert solution.intersection(nums1, nums2) == [2]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums1 = [4, 9, 5]
    nums2 = [9, 4, 9, 8, 4]
    assert solution.intersection(nums1, nums2) == [9, 4]
