import pytest

from sort_solution import SortSolution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        SortSolution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    expected = [["bat"], ["eat", "tea", "ate"], ["tan", "nat"]]
    assert sorted(solution.groupAnagrams(strs)) == sorted(expected)


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    strs = [""]
    expected = [[""]]
    assert solution.groupAnagrams(strs) == expected


@pytest.mark.parametrize("solution", provide_solutions())
def test_2(solution: Task):
    strs = ["a"]
    expected = [["a"]]
    assert solution.groupAnagrams(strs) == expected
