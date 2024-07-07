package dev.alexengrig.leetcode._739_daily_temperatures;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution implements Task {
    @Override
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(n);
        for (int right = 0; right < n; right++) {
            while (!stack.isEmpty() && temperatures[right] > temperatures[stack.peek()]) {
                int left = stack.pop();
                answer[left] = right - left;
            }
            stack.push(right);
        }
        return answer;
    }
}
