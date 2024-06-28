package dev.alexengrig.leetcode._228_summary_ranges;

import java.util.ArrayList;
import java.util.List;

class Solution implements Task {
    @Override
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> results = new ArrayList<>(n);
        int min, max;
        for (int i = 0; i < n; i++) {
            min = nums[i];
            while (i + 1 < n && nums[i] == nums[i + 1] - 1) {
                i++;
            }
            max = nums[i];
            if (min == max) {
                results.add(String.valueOf(min));
            } else {
                results.add(min + "->" + max);
            }
        }
        return results;
    }
}
