package dev.alexengrig.leetcode._1909_remove_element_to_array_increasing;


public class Solution implements Task {
    @Override
    public boolean canBeIncreasing(int[] nums) {
        boolean removed = false;
        for (int i = 1, n = nums.length; i < n; i++) {
            if (nums[i - 1] >= nums[i]) {
                if (removed) {
                    return false;
                }
                removed = true;
                if (i > 1 && nums[i - 2] >= nums[i]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
