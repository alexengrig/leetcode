package dev.alexengrig.leetcode._1_two_sum;

class BruteForceSolution implements Task {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int i, j, l;
        for (i = 0, l = nums.length; i < l; i++) {
            for (j = i + 1; j < l; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No sum of " + target);
    }
}
