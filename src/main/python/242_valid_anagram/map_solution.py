from collections import Counter

from task import Task


class MapSolution(Task):
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        counts = Counter(s)
        for ch in t:
            if ch in counts:
                if counts[ch] == 1:
                    counts.pop(ch)
                else:
                    counts[ch] -= 1
        return len(counts) == 0
