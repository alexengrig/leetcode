package dev.alexengrig.leetcode._69_sqrtx;

class Solution implements Task {
    @Override
    public int mySqrt(int x) {
        if (x < 2) return x;
        long l = 1, r = x / 2, mid, sqrt;
        while (l <= r) {
            mid = (l + r) / 2;
            if ((sqrt = mid * mid) == x) {
                return (int) mid;
            } else if (sqrt > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int) l - 1;
    }
}
