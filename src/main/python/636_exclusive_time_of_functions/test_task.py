import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    n = 2
    logs = ["0:start:0", "1:start:2", "1:end:5", "0:end:6"]
    assert solution.exclusiveTime(n, logs) == [3, 4]


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    n = 1
    logs = ["0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"]
    assert solution.exclusiveTime(n, logs) == [8]


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    n = 2
    logs = ["0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7"]
    assert solution.exclusiveTime(n, logs) == [7, 1]
