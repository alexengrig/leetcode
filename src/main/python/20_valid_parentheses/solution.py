from typing import List

from task import Task


class Solution(Task):
    def isValid(self, s: str) -> bool:
        stack = []
        for cur in s:
            if cur == '(' or cur == '{' or cur == '[':
                stack.append(cur)
            else:
                if len(stack) == 0:
                    return False
                prev = stack.pop()
                if cur == ')' and prev != '(':
                    return False
                if cur == '}' and prev != '{':
                    return False
                if cur == ']' and prev != '[':
                    return False
        return len(stack) == 0
