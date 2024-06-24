package dev.alexengrig.leetcode._424_longest_repeating_character_replacement;

class Solution implements Task {
    @Override
    public int characterReplacement(String s, int k) {
        int[] counts = new int[26]; // English alphabet size
        int l = 0, r = 0;
        for (int max = 0, n = s.length(); r < n; r++) {
            char ch = s.charAt(r);
            counts[ch - 'A']++;
            if (max < counts[ch - 'A']) {
                max = counts[ch - 'A'];
            }
            if (max + k < r - l + 1) {
                counts[s.charAt(l) - 'A']--;
                l++;
            }
        }
        return r - l;
    }
}
