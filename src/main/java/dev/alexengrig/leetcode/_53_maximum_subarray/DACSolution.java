package dev.alexengrig.leetcode._53_maximum_subarray;

class DACSolution implements Task {
    @Override
    public int maxSubArray(int[] nums) {
        return dac(nums, 0, nums.length - 1).max;
    }

    Sum dac(int[] nums, int l, int r) {
        if (l == r) {
            return new Sum(nums[l]);
        }
        int m = l + (r - l) / 2;
        Sum left = dac(nums, l, m);
        Sum right = dac(nums, m + 1, r);
        int curr = left.curr + right.curr;
        int max = Math.max(left.rightMax + right.leftMax, Math.max(left.max, right.max));
        int leftMax = Math.max(left.leftMax, left.curr + right.leftMax);
        int rightMax = Math.max(right.curr + left.rightMax, right.rightMax);
        return new Sum(curr, max, leftMax, rightMax);
    }

    static class Sum {
        int curr;
        int max;
        int leftMax;
        int rightMax;

        Sum(int value) {
            this(value, value, value, value);
        }

        Sum(int curr, int max, int leftMax, int rightMax) {
            this.curr = curr;
            this.max = max;
            this.leftMax = leftMax;
            this.rightMax = rightMax;
        }
    }
}
