import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    temperatures = [73, 74, 75, 71, 69, 72, 76, 73]
    assert solution.dailyTemperatures(temperatures) == [1, 1, 4, 2, 1, 1, 0, 0]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    temperatures = [30, 40, 50, 60]
    assert solution.dailyTemperatures(temperatures) == [1, 1, 1, 0]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    temperatures = [30, 60, 90]
    assert solution.dailyTemperatures(temperatures) == [1, 1, 0]
