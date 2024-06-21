package dev.alexengrig.leetcode._162_find_peak_element;

class Solution implements Task {
    @Override
    public int findPeakElement(int[] nums) {
        int n = nums.length, l = 0, r = n - 1, mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (nums[mid] >= nums[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
