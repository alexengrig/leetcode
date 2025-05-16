import pytest

from map_solution import MapSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        MapSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    assert solution.isAnagram("anagram", "nagaram") is True


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    assert solution.isAnagram("rat", "car") is False
