package dev.alexengrig.leetcode._20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution implements Task {
    @Override
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>(s.length());
        for (int i = 0, n = s.length(); i < n; i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            } else {
                if (stack.isEmpty()) return false;
                char prev = stack.pop();
                if (prev == '(' && curr != ')') return false;
                if (prev == '[' && curr != ']') return false;
                if (prev == '{' && curr != '}') return false;
            }
        }
        return stack.isEmpty();
    }
}
