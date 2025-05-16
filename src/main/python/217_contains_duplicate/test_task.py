import pytest

from set_solution import SetSolution
from sort_solution import SortSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        SetSolution(),
        SortSolution()
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_contains_duplicate_true(solution: Task):
    nums = [1, 2, 3, 1]
    assert solution.containsDuplicate(nums) is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_contains_duplicate_false(solution: Task):
    nums = [1, 2, 3, 4]
    assert solution.containsDuplicate(nums) is False


@pytest.mark.parametrize("solution", provide_solutions())
def test_contains_duplicate_empty(solution: Task):
    nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
    assert solution.containsDuplicate(nums) is True
