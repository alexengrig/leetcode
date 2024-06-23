package dev.alexengrig.leetcode._242_valid_anagram;

class AlphabetSolution implements Task {
    @Override
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] counts = new char[26]; // English alphabet size
        for (char ch : s.toCharArray()) {
            counts[ch - 'a']++;
        }
        for (char ch : t.toCharArray()) {
            if (0 == counts[ch - 'a']--) {
                return false;
            }
        }
        return true;
    }
}
