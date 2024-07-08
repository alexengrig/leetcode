package dev.alexengrig.leetcode._169_majority_element;

class Solution implements Task {
    @Override
    public int majorityElement(int[] nums) {
        int major = nums[0], count = 1, num;
        for (int i = 1, n = nums.length; i < n; i++) {
            num = nums[i];
            if (count == 0) {
                major = num;
            }
            if (major == num) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}
