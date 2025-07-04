from task import MinStack


class MyMinStack(MinStack):

    def __init__(self):
        super().__init__()
        self.stack = []

    def push(self, val: int):
        if len(self.stack):
            min_val = min(val, self.getMin())
        else:
            min_val = val
        value = Value(val, min_val)
        self.stack.append(value)

    def pop(self):
        self.stack.pop()

    def top(self) -> int:
        return self.stack[-1].val

    def getMin(self) -> int:
        return self.stack[-1].minVal


class Value(object):
    def __init__(self, val, min_val):
        self.val = val
        self.minVal = min_val
