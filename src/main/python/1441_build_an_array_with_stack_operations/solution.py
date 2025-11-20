from typing import List

from task import Task


class Solution(Task):
    def buildArray(self, target: List[int], n: int) -> List[str]:
        res: List[str] = []
        i, num = 0, 1
        while i < len(target) and num <= n:
            res.append('Push')
            if target[i] == num:
                i += 1
            else:
                res.append('Pop')
            num += 1
        return res
