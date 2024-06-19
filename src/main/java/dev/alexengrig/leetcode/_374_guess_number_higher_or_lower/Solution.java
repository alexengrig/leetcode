package dev.alexengrig.leetcode._374_guess_number_higher_or_lower;

abstract class Solution implements Task {
    @Override
    public int guessNumber(int n) {
        int l = 1, r = n, mid, g;
        while (l <= r) {
            mid = l + (r - l) / 2;
            g = guess(mid);
            if (g == 0) {
                return mid;
            } else if (g == 1) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        throw new IllegalArgumentException(); // unreachable
    }
}
