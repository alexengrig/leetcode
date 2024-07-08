package dev.alexengrig.leetcode._300_longest_increasing_subsequence;

class NLogNSolution implements Task {
    @Override
    public int lengthOfLIS(int[] nums) {
        int length = 0;
        int[] dp = new int[nums.length];
        for (int num : nums) {
            int i = binarySearch(dp, length, num);
            dp[i] = num;
            if (i == length) {
                length++;
            }
        }
        return length;
    }

    int binarySearch(int[] nums, int length, int target) {
        int left = 0, right = length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
