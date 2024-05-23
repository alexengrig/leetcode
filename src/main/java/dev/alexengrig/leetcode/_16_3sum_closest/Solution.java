package dev.alexengrig.leetcode._16_3sum_closest;

import java.util.Arrays;

class Solution implements Task {
    @Override
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int maxSum = 0, minDiff = Integer.MAX_VALUE;
        int sum, diff, right, left;
        for (int i = 0; i < nums.length - 2; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                diff = target - sum;
                if (diff == 0) {
                    return sum;
                } else if (diff > 0) {
                    do {
                        left++;
                    } while (left < nums.length - 1 && nums[left - 1] == nums[left]);
                } else {
                    do {
                        right--;
                    } while (right > left && nums[right] == nums[right + 1]);
                }
                if (Math.abs(diff) < Math.abs(minDiff)) {
                    minDiff = diff;
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}
