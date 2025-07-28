import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    prices = [7, 1, 5, 3, 6, 4]
    assert solution.maxProfit(prices) == 5


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    prices = [7, 6, 4, 3, 1]
    assert solution.maxProfit(prices) == 0

