from typing import List

from task import Task


class Solution(Task):
    def encode(self, strs: List[str]) -> str:
        return ''.join([str(len(s)) + '{' + s for s in strs])

    def decode(self, s: str) -> List[str]:
        strs = []
        n = len(s)
        i = 0
        while i < n:
            j = i
            while s[j] != '{':
                j += 1
            l = int(s[i:j])
            i = j + 1
            j = i + l
            strs.append(s[i:j])
            i = j

        return strs
