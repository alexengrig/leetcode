package dev.alexengrig.leetcode._15_3sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution implements Task {
    @Override
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> results = new ArrayList<>();
        for (int left = 0, mid, right, sum; left < nums.length - 2; left++) {
            if (left > 0 && nums[left - 1] == nums[left]) continue;
            mid = left + 1;
            right = nums.length - 1;
            while (mid < right) {
                if ((sum = nums[left] + nums[mid] + nums[right]) == 0) {
                    results.add(List.of(nums[left], nums[mid], nums[right]));
                    do {
                        mid++;
                    } while (mid < nums.length - 1 && nums[mid - 1] == nums[mid]);
                    do {
                        right--;
                    } while (right > mid && nums[right] == nums[right + 1]);
                } else if (sum < 0) {
                    do {
                        mid++;
                    } while (mid < nums.length - 1 && nums[mid - 1] == nums[mid]);
                } else {
                    do {
                        right--;
                    } while (right > mid && nums[right] == nums[right + 1]);
                }
            }
        }
        return results;
    }
}
