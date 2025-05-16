import pytest

from map_solution import MapSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        MapSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [2, 7, 11, 15]
    target = 9
    assert solution.twoSum(nums, target) == [0, 1]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [3, 2, 4]
    target = 6
    assert solution.twoSum(nums, target) == [1, 2]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [3, 3]
    target = 6
    assert solution.twoSum(nums, target) == [0, 1]
