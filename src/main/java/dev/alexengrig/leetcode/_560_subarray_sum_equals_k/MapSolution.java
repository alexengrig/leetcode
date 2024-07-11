package dev.alexengrig.leetcode._560_subarray_sum_equals_k;

import java.util.HashMap;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);
        for (int num : nums) {
            sum += num;
            count += counts.getOrDefault(sum - k, 0);
            counts.merge(sum, 1, Integer::sum);
        }
        return count;
    }
}
