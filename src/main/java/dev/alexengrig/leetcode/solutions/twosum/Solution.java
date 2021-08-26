package dev.alexengrig.leetcode.solutions.twosum;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
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

    public int[] twoSumBruteforce(int[] nums, int target) {
        int i, j, l;
        for (i = 0, l = nums.length; i < l; i++) {
            for (j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No sum of " + target);
    }
}
