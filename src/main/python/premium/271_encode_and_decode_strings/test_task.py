import pytest

from solution import Solution
from task import Task


def provide_solutions() -> list[Task]:
    return [
        Solution(),
    ]


@pytest.mark.parametrize("solution", provide_solutions())
def test_0(solution: Task):
    strs = ["neet", "code", "love", "you"]
    encoded = solution.encode(strs)
    assert encoded == "4{neet4{code4{love3{you"
    decoded = solution.decode(encoded)
    assert decoded == strs


@pytest.mark.parametrize("solution", provide_solutions())
def test_1(solution: Task):
    strs = ["we", "say", ":", "yes"]
    encoded = solution.encode(strs)
    assert encoded == "2{we3{say1{:3{yes"
    decoded = solution.decode(encoded)
    assert decoded == strs
