package dev.alexengrig.leetcode._150_evaluate_reverse_polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("Convert2MethodRef")
class Solution implements Task {
    @Override
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>(tokens.length);
        for (String token : tokens) {
            switch (token) {
                case "+" -> operate(stack, (l, r) -> l + r);
                case "-" -> operate(stack, (l, r) -> l - r);
                case "*" -> operate(stack, (l, r) -> l * r);
                case "/" -> operate(stack, (l, r) -> l / r);
                default -> stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    void operate(Deque<Integer> stack, IntBinaryOperator operation) {
        int right = stack.pop();
        int left = stack.pop();
        int result = operation.applyAsInt(left, right);
        stack.push(result);
    }
}
