import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [2,2,1]
    assert solution.singleNumber(nums) == 1


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    nums = [2,2,1]
    assert solution.singleNumber(nums) == 1
