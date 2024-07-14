package dev.alexengrig.leetcode._395_longest_substring_with_k_repeating;

@SuppressWarnings("DuplicateExpressions")
class Solution implements Task {
    @Override
    public int longestSubstring(String s, int k) {
        int max = 0;
        for (int n = 1; n <= 26; n++) {
            max = Math.max(max, longestSubstringWithNUniqueLetters(s, k, n));
        }
        return max;
    }

    int longestSubstringWithNUniqueLetters(String s, int k, int n) {
        int[] counts = new int[26];
        int max = 0, uniqueLetters = 0, kLetters = 0;
        for (int l = 0, r = 0, len = s.length(); r < len; r++) {
            if (++counts[s.charAt(r) - 'a'] == 1) {
                ++uniqueLetters;
            }
            if (counts[s.charAt(r) - 'a'] == k) {
                ++kLetters;
            }
            while (uniqueLetters > n) {
                if (counts[s.charAt(l) - 'a'] == k) {
                    --kLetters;
                }
                if (--counts[s.charAt(l) - 'a'] == 0) {
                    --uniqueLetters;
                }
                l++;
            }
            if (kLetters == n) {
                max = Math.max(max, r - l + 1);
            }
        }
        return max;
    }
}
