package dev.alexengrig.leetcode.premium._356_line_reflection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution implements Task {
    @Override
    public boolean isReflected(int[][] points) {
        int min = points[0][0], max = min;
        Set<List<Integer>> set = new HashSet<>();
        set.add(List.of(points[0][0], points[0][1]));
        for (int i = 1, n = points.length; i < n; i++) {
            min = Math.min(min, points[i][0]);
            max = Math.max(max, points[i][0]);
            set.add(List.of(points[i][0], points[i][1]));
        }
        int sum = min + max;
        for (int[] xy : points) {
            if (!set.contains(List.of(sum - xy[0], xy[1]))) {
                return false;
            }
        }
        return true;
    }
}
