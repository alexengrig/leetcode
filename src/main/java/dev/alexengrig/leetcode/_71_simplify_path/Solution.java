package dev.alexengrig.leetcode._71_simplify_path;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution implements Task {
    @Override
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>(parts.length);
        for (String part : parts) {
            if (!part.isEmpty()) {
                if ("..".equals(part)) {
                    if (!stack.isEmpty()) {
                        stack.removeLast();
                    }
                } else if (!".".equals(part)) {
                    stack.addLast(part);
                }
            }
        }
        return "/" + String.join("/", stack);
    }
}
