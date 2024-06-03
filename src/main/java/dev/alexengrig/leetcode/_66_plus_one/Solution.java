package dev.alexengrig.leetcode._66_plus_one;

import java.util.ArrayDeque;

class Solution implements Task {
    @Override
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        var res = new ArrayDeque<Integer>(n + 1);
        int sum, over = 1;
        for (int i = n - 1; i >= 0; i--) {
            sum = over + digits[i];
            over = sum / 10;
            res.addFirst(sum % 10);
        }
        if (over > 0) {
            res.addFirst(over);
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
