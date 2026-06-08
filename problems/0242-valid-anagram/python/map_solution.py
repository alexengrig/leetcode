# Time: O(n + m)
# Space: O(n)

from collections import Counter

from task import Task


class MapSolution(Task):
    def isAnagram(self, s: str, t: str) -> bool:
        counts = Counter(s)
        for ch in t:
            if ch in counts:
                counts[ch] -= 1
                if counts[ch] == 0:
                    counts.pop(ch)
            else:
                return False
        return len(counts) == 0
