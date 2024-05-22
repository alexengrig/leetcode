package dev.alexengrig.leetcode._153_find_minimum_in_rotated_sorted_array;

class Solution implements Task {
    @Override
    public int findMin(int[] nums) {
        int last = nums[nums.length - 1], left = 0, right = nums.length - 1, mid, prev;
        while (left < right) {
            mid = left + (right - left) / 2;
            prev = mid == 0 ? last : nums[mid - 1];
            if (prev > nums[mid]) {
                return nums[mid];
            } else if (nums[mid] > last) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left];
    }
}
