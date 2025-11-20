import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    target = [1, 3]
    n = 3
    assert solution.buildArray(target, n) == ["Push", "Push", "Pop", "Push"]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    target = [1, 2, 3]
    n = 3
    assert solution.buildArray(target, n) == ["Push", "Push", "Push"]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    target = [1, 2]
    n = 4
    assert solution.buildArray(target, n) == ["Push", "Push"]
