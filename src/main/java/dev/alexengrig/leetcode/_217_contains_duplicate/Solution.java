package dev.alexengrig.leetcode._217_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

class Solution implements Task {
    @Override
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
