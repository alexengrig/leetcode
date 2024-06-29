package dev.alexengrig.leetcode._7_reverse_integer;

class Solution implements Task {
    @Override
    public int reverse(int x) {
        long result = 0;
        for (int i = x; i != 0; i /= 10) {
            result *= 10;
            result += i % 10;
        }
        return result == (int) result ? (int) result : 0;
    }
}
