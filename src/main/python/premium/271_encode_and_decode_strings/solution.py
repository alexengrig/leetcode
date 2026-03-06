from typing import List

from task import Task


class Solution(Task):
    def encode(self, strs: List[str]) -> str:
        return ''.join([str(len(s)) + '}' + s for s in strs])

    def decode(self, s: str) -> List[str]:
        strs = []
        i, n = 0, len(s)
        while i < n:
            j = i
            while s[j] != '}' and j < n:
                j += 1
            if s[j] != '}':
                raise ValueError('Invalid input: no "}"')
            lraw = s[i:j]
            if not lraw.isdigit():
                raise ValueError('Invalid input, length is not digit: ' + lraw)
            l = int(lraw)
            i = j + 1
            j = i + l
            if j > n:
                raise ValueError('Invalid input, the last length is too long: ' + str(l))
            strs.append(s[i:j])
            i = j
        return strs
