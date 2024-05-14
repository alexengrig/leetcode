package dev.alexengrig.leetcode._1_two_sum;

import java.util.HashMap;

class MapSolution implements Task {
    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>((int) Math.ceil(nums.length / 0.75));
        map.put(target - nums[0], 0);
        int l, j, i, num;
        for (j = 1, l = nums.length; j < l; j++) {
            if (map.containsKey((num = nums[j])) && (i = map.get(num)) != j) {
                return new int[]{i, j};
            }
            map.put(target - num, j);
        }
        throw new IllegalArgumentException("No sum of " + target);
    }
}
