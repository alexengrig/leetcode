package dev.alexengrig.leetcode._567_permutation_in_string;

class AlphabetSolution implements Task {
    @Override
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) {
            return false;
        }
        int[] counts = new int[26]; // English alphabet size
        for (char ch : s1.toCharArray()) {
            counts[ch - 'a']++;
        }
        int size = n1;
        for (int left = 0, right = 0; right < n2; right++) {
            if (--counts[s2.charAt(right) - 'a'] >= 0) {
                size--;
            }
            while (size == 0) {
                if (right - left + 1 == n1) {
                    return true;
                }
                if (++counts[s2.charAt(left++) - 'a'] > 0) {
                    size++;
                }
            }
        }
        return false;
    }
}
