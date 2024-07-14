package dev.alexengrig.leetcode._581_shortest_unsorted_continuous_subarray;

class Solution implements Task {
    @Override
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = 0, right = -1;
        int min = nums[n-1], max = nums[0];
        for (int down = n - 2, up = 1; up < n; down--, up++) {
            if (min < nums[down]) {
                left = down;
            } else {
                min = nums[down];
            }
            if (max > nums[up]) {
                right = up;
            } else {
                max = nums[up];
            }
        }
        return right - left + 1;
    }
}
