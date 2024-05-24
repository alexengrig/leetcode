package dev.alexengrig.leetcode._18_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution implements Task {
    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        int left, right;
        long sum;
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j - 1] == nums[j]) continue;
                left = j + 1;
                right = nums.length - 1;
                while (left < right) {
                    sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        results.add(List.of(nums[i], nums[j], nums[left], nums[right]));
                    }
                    if (sum <= target) {
                        do {
                            left++;
                        } while (left < right && nums[left - 1] == nums[left]);
                    } else {
                        do {
                            right--;
                        } while (right > left && nums[right] == nums[right + 1]);
                    }
                }
            }
        }
        return results;
    }
}
