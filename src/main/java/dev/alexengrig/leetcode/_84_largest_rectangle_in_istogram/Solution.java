package dev.alexengrig.leetcode._84_largest_rectangle_in_istogram;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution implements Task {
    @Override
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0, n = heights.length; i <= n; i++) {
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] > heights[i])) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                max = Math.max(max, h * w);
            }
            stack.push(i);
        }
        return max;
    }
}
