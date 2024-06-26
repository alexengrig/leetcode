package dev.alexengrig.leetcode._56_merge_intervals;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

class Solution implements Task {
    @Override
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Deque<int[]> results = new ArrayDeque<>(n);
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        results.add(intervals[0]);
        int[] prev, curr;
        for (int i = 1; i < n; i++) {
            prev = results.getLast();
            curr = intervals[i];
            if (prev[1] < curr[0]) {
                results.addLast(curr);
            } else if (prev[1] < curr[1]) {
                prev[1] = curr[1];
            }
        }
        return results.toArray(int[][]::new);
    }
}
