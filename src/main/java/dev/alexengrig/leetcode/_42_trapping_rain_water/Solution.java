package dev.alexengrig.leetcode._42_trapping_rain_water;

class Solution implements Task {
    @Override
    public int trap(int[] height) {
        int n = height.length;
        int l = 0, r = n - 1;
        int lMax = height[l], rMax = height[r], res = 0;
        while (l < r) {
            if (lMax < rMax) {
                res += lMax - height[l];
                lMax = Math.max(lMax, height[++l]);
            } else {
                res += rMax - height[r];
                rMax = Math.max(rMax, height[--r]);
            }
        }
        return res;
    }
}
