package dev.alexengrig.leetcode._76_minimum_window_substring;

public class Solution implements Task {
    @Override
    public String minWindow(String s, String t) {
        int[] counts = new int[128];
        for (char ch : t.toCharArray()) {
            counts[ch]++;
        }
        int size = t.length(), min = s.length() + 1, left = -1;
        for (int l = 0, r = 0, n = s.length(); r < n; r++) {
            if (--counts[s.charAt(r)] >= 0) {
                size--;
            }
            while (size == 0) {
                if (r - l + 1 < min) {
                    min = r - l + 1;
                    left = l;
                }
                if (++counts[s.charAt(l)] > 0) {
                    size++;
                }
                l++;
            }
        }
        return left == -1 ? "" : s.substring(left, left + min);
    }
}
