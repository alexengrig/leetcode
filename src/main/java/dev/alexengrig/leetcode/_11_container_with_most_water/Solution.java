package dev.alexengrig.leetcode._11_container_with_most_water;

class Solution implements Task {
    @Override
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0, s;
        while (l < r) {
            s = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(max, s);
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return max;
    }
}