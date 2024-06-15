package dev.alexengrig.leetcode._278_first_bad_version;

abstract class Solution implements Task {
    @Override
    public int firstBadVersion(int n) {
        long l = 1, r = n, mid;
        while (l <= r) {
            mid = (l + r) / 2;
            if (isBadVersion((int) mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int) l;
    }
}
