from typing import List

from task import Task


class Solution(Task):
    def exclusiveTime(self, n: int, logs: List[str]) -> List[int]:
        res = [0] * n
        s: List[int] = []
        prev_ts = -1
        for log in logs:
            fid, label, ts = (f(x) for f, x in zip((int, str, int), log.split(':')))
            if label == 'start':
                if len(s) > 0:
                    res[s[-1]] += ts - prev_ts
                s.append(fid)
                prev_ts = ts
            else:
                res[s.pop()] += ts - prev_ts + 1
                prev_ts = ts + 1
        return res
