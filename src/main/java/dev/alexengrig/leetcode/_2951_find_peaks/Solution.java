package dev.alexengrig.leetcode._2951_find_peaks;

import java.util.ArrayList;
import java.util.List;

class Solution implements Task {
    @Override
    public List<Integer> findPeaks(int[] mountain) {
        int n = mountain.length;
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            if (mountain[i - 1] < mountain[i] && mountain[i] > mountain[i + 1]) {
                peaks.add(i);
            }
        }
        return peaks;
    }
}
