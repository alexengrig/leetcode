package dev.alexengrig.leetcode._150_evaluate_reverse_polish_notation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.IntBinaryOperator;

@SuppressWarnings("Convert2MethodRef")
class Solution implements Task {
    @Override
    public int evalRPN(String[] tokens) {
        Deque<String> stack = new ArrayDeque<>(tokens.length);
        for (String token : tokens) {
            switch (token) {
                case "+" -> operate(stack, (l, r) -> l + r);
                case "-" -> operate(stack, (l, r) -> l - r);
                case "*" -> operate(stack, (l, r) -> l * r);
                case "/" -> operate(stack, (l, r) -> l / r);
                default -> stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    void operate(Deque<String> stack, IntBinaryOperator operation) {
        String right = stack.pop();
        String left = stack.pop();
        String result = Integer.toString(
                operation.applyAsInt(
                        Integer.parseInt(left),
                        Integer.parseInt(right)
                )
        );
        stack.push(result);
    }
}
