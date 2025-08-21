from collections import defaultdict

from task import TimeMap


class MyTimeMap(TimeMap):
    def __init__(self):
        super().__init__()
        self.data = defaultdict(list)

    def set(self, key: str, value: str, timestamp: int) -> None:
        self.data[key].append((timestamp, value))

    def get(self, key: str, timestamp: int) -> str:
        if key not in self.data:
            return ''
        vals = self.data[key]
        l, r = 0, len(vals) - 1
        value = ''
        while l <= r:
            m = l + (r - l) // 2
            if vals[m][0] <= timestamp:
                value = vals[m][1]
                l = m + 1
            else:
                r = m - 1
        return value
