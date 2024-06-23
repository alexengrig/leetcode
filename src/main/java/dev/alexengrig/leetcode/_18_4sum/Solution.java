package dev.alexengrig.leetcode._18_4sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution implements Task {
    @Override
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if (nums.length < 4) {
            return List.of();
        }
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int l, r;
        long sum;
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                l = j + 1;
                r = nums.length - 1;
                while (l < r) {
                    sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        result.add(List.of(nums[i], nums[j], nums[l], nums[r]));
                        l = skipLeft(nums, l, r);
                        r = skipRight(nums, l, r);
                    } else if (sum < target) {
                        l = skipLeft(nums, l, r);
                    } else {
                        r = skipRight(nums, l, r);
                    }
                }
            }
        }
        return result;
    }

    int skipLeft(int[] nums, int l, int r) {
        do {
            l++;
        } while (l < r && nums[l] == nums[l - 1]);
        return l;
    }

    int skipRight(int[] nums, int l, int r) {
        do {
            r--;
        } while (l < r && nums[r] == nums[r + 1]);
        return r;
    }
}
