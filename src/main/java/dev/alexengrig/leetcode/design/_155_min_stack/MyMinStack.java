package dev.alexengrig.leetcode.design._155_min_stack;

import java.util.ArrayDeque;
import java.util.Deque;

@SuppressWarnings("DataFlowIssue")
class MyMinStack implements MinStack {
    private final Deque<MinValue> values = new ArrayDeque<>();

    public void push(int val) {
        MinValue value;
        if (values.isEmpty()) {
            value = new MinValue(val);
        } else {
            value = new MinValue(val, Math.min(val, values.peek().min));
        }
        values.push(value);
    }

    public void pop() {
        values.pop();
    }

    public int top() {
        return values.peek().val;
    }

    public int getMin() {
        return values.peek().min;
    }

    private static class MinValue {
        int val;
        int min;

        MinValue(int val) {
            this.val = val;
            this.min = val;
        }

        MinValue(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
}
