package dev.alexengrig.leetcode._844_backspace_string_compare;

import java.util.Deque;
import java.util.LinkedList;

class StackSolution implements Task {
    @Override
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stack1 = toStack(s);
        Deque<Character> stack2 = toStack(t);
        return stack1.equals(stack2);
    }

    Deque<Character> toStack(String str) {
        Deque<Character> stack = new LinkedList<>();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }
        return stack;
    }
}
