from collections import Counter

import pytest

from map_solution import MapSolution
from task import Task
from twop_solution import TwoPointersSolution


def provide_solutions() -> list[Task]:
    return [
        MapSolution(),
        TwoPointersSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums1 = [1, 2, 2, 1]
    nums2 = [2, 2]
    res = solution.intersect(nums1, nums2)
    assert Counter(res) == Counter([2, 2])


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums1 = [4, 9, 5]
    nums2 = [9, 4, 9, 8, 4]
    res = solution.intersect(nums1, nums2)
    assert Counter(res) == Counter([4, 9])
