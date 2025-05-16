from task import Task


class MapSolution(Task):
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        counts = {}
        for l, r in zip(s, t):
            counts[l] = counts.get(l, 0) + 1
            counts[r] = counts.get(r, 0) - 1
        for v in counts.values():
            if v != 0:
                return False
        return True
