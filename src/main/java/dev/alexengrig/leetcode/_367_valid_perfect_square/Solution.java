package dev.alexengrig.leetcode._367_valid_perfect_square;

class Solution implements Task {
    @Override
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        if (num < 4) return false;
        int l = 2, r = num / 2, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (mid >= num / mid) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l * l == num;
    }
}
