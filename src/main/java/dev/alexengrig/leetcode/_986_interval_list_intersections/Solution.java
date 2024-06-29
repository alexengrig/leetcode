package dev.alexengrig.leetcode._986_interval_list_intersections;

import java.util.ArrayList;
import java.util.List;

class Solution implements Task {
    @Override
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> results = new ArrayList<>();
        int n1 = firstList.length, n2 = secondList.length;
        int i = 0, j = 0, left, right;
        int[] first, second;
        while (i < n1 && j < n2) {
            first = firstList[i];
            second = secondList[j];
            left = Math.max(first[0], second[0]);
            right = Math.min(first[1], second[1]);
            if (left <= right) {
                results.add(new int[]{left, right});
            }
            if (first[1] < second[1]) {
                i++;
            } else {
                j++;
            }
        }
        return results.toArray(int[][]::new);
    }
}
