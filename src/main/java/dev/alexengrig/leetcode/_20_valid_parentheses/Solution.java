package dev.alexengrig.leetcode._20_valid_parentheses;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution implements Task {
    @Override
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>(s.length());
        char prev;
        for (char curr : s.toCharArray()) {
            if (curr == '(' || curr == '[' || curr == '{') {
                stack.addFirst(curr);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                prev = stack.removeFirst();
                if (curr == ')' && prev != '(') {
                    return false;
                } else if (curr == ']' && prev != '[') {
                    return false;
                } else if (curr == '}' && prev != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
