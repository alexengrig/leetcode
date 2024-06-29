package dev.alexengrig.leetcode._283_move_zeroes;

class Solution implements Task {
    @Override
    public void moveZeroes(int[] nums) {
        int tmp;
        for (int left = 0, right = 0, n = nums.length; right < n; right++) {
            if (nums[right] != 0) {
                tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
            }
        }
    }
}
