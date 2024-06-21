package dev.alexengrig.leetcode._154_find_minimum_in_rotated_sorted_array2;

class Solution implements Task {
    @Override
    public int findMin(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        int l = 0, r = n - 1;
        if (nums[r] > nums[l]) return nums[l];
        int mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } else if (nums[mid] < nums[r]) {
                r = mid;
            } else if (nums[mid] > nums[r]) {
                l = mid + 1;
            } else {
                r--;
            }
        }
        return nums[l];
    }
}
