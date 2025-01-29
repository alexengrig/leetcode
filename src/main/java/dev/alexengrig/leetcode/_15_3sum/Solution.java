package dev.alexengrig.leetcode._15_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution implements Task {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int l = i + 1, r = n - 1, sum;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    do {
                        l++;
                    } while (l < r - 1 && nums[l - 1] == nums[l]);
                    do {
                        r--;
                    } while (l < r && nums[r] == nums[r + 1]);
                } else if (sum < 0) {
                    do {
                        l++;
                    } while (l < r - 1 && nums[l - 1] == nums[l]);
                } else {
                    do {
                        r--;
                    } while (l < r && nums[r] == nums[r + 1]);
                }
            }
        }
        return res;
    }
}
