package dev.alexengrig.leetcode._3_longest_substring_without_repeating_characters;

class Solution implements Task {
    @Override
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, max = 0;
        char[] counts = new char[128];
        char ch;
        for (int n = s.length(); r < n; r++) {
            ch = s.charAt(r);
            counts[ch]++;
            while (counts[ch] > 1) {
                counts[s.charAt(l)]--;
                l++;
            }
            if (max < r - l + 1) {
                max = r - l + 1;
            }
        }
        return max;
    }
}
