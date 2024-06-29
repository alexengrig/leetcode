package dev.alexengrig.leetcode._658_find_k_closest_elements;

import java.util.ArrayList;
import java.util.List;

class Solution implements Task {
    @Override
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k, m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (x - arr[m] <= arr[m + k] - x) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        List<Integer> results = new ArrayList<>(k);
        for (int i = l, n = l + k; i < n; i++) {
            results.add(arr[i]);
        }
        return results;
    }
}
