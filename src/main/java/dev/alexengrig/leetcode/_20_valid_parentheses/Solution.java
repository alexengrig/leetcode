package dev.alexengrig.leetcode._20_valid_parentheses;

import java.util.ArrayDeque;

class Solution implements Task {
    @Override
    public boolean isValid(String s) {
        var stack = new ArrayDeque<Character>(s.length());
        char prev;
        for (char cur : s.toCharArray()) {
            if (cur == '(' || cur == '{' || cur == '[') {
                stack.addFirst(cur);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            prev = stack.removeFirst();
            if ((cur == ')' && prev != '(')
                || (cur == '}' && prev != '{')
                || (cur == ']' && prev != '[')
            ) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
