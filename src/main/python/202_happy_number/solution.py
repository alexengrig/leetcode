from task import Task


class Solution(Task):
    def isHappy(self, n: int) -> bool:
        def calc(num: int) -> int:
            s = 0
            while num > 0:
                s += (num % 10) ** 2
                num //= 10
            return s

        slow, fast = calc(n), calc(calc(n))
        while slow != fast:
            slow, fast = calc(slow), calc(calc(fast))
        return slow == 1
