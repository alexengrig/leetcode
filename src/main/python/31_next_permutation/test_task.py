import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [1, 2, 3]
    solution.nextPermutation(nums)
    assert nums == [1, 3, 2]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    nums = [3, 2, 1]
    solution.nextPermutation(nums)
    assert nums == [1, 2, 3]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    nums = [1, 1, 5]
    solution.nextPermutation(nums)
    assert nums == [1, 5, 1]
