import pytest

from heap_solution import HeapSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        HeapSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert set(solution.topKFrequent([1, 1, 1, 2, 2, 3], 2)) == set([1, 2])


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert set(solution.topKFrequent([1], 1)) == set([1])
