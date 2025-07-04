from typing import List

from task import Task


class Solution(Task):
    def evalRPN(self, tokens: List[str]) -> int:
        stack = []
        for t in tokens:
            if t == '+':
                r, l = stack.pop(), stack.pop()
                stack.append(l + r)
            elif t == '-':
                r, l = stack.pop(), stack.pop()
                stack.append(l - r)
            elif t == '*':
                r, l = stack.pop(), stack.pop()
                stack.append(l * r)
            elif t == '/':
                r, l = stack.pop(), stack.pop()
                stack.append(int(l / r))
            else:
                stack.append(int(t))
        return stack[0]
