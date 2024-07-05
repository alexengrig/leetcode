package dev.alexengrig.leetcode._387_first_unique_character_in_string;

class Solution implements Task {
    @Override
    public int firstUniqChar(String s) {
        int[] counts = new int[26]; // English alphabet size
        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        for (int i = 0, n = s.length(); i < n; i++) {
            if (counts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
