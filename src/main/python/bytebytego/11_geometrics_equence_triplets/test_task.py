import pytest

from map_solution import MapSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        MapSolution()
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [2, 1, 2, 4, 8, 8]
    r = 2
    assert solution.geometric_sequence_triplets(nums, r) == 5


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [4, 2, 1, 1, 2, 4]
    r = 2
    assert solution.geometric_sequence_triplets(nums, r) == 2
