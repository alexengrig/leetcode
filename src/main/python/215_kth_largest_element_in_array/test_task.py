import pytest

from heap_solution import HeapSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        HeapSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [3, 2, 1, 5, 6, 4]
    k = 2
    assert solution.findKthLargest(nums, k) == 5


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [3, 2, 3, 1, 2, 4, 5, 5, 6]
    k = 4
    assert solution.findKthLargest(nums, k) == 4
