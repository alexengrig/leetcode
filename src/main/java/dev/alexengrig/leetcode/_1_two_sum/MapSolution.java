package dev.alexengrig.leetcode._1_two_sum;

import java.util.HashMap;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        throw new IllegalArgumentException(); // unreachable
    }
}
