package dev.alexengrig.leetcode._217_contains_duplicate;

import java.util.Arrays;

class SortSolution implements Task {
    @Override
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
