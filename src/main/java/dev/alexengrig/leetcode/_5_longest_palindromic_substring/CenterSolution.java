package dev.alexengrig.leetcode._5_longest_palindromic_substring;

class CenterSolution implements Task {
    @Override
    public String longestPalindrome(String s) {
        int[] index = new int[]{0, 0};
        for (int i = 1, n = s.length(); i < n; i++) {
            int[] idx1 = expand(s, i, i);
            if (index[1] - index[0] < idx1[1] - idx1[0]) {
                index = idx1;
            }
            if (i + 1 < n && s.charAt(i) == s.charAt(i + 1)) {
                int[] idx2 = expand(s, i, i + 1);
                if (index[1] - index[0] < idx2[1] - idx2[0]) {
                    index = idx2;
                }
            }
        }
        return s.substring(index[0], index[1] + 1);
    }

    int[] expand(String s, int l, int r) {
        for (int n = s.length(); l >= 0 && r < n; l--, r++) {
            if (s.charAt(l) != s.charAt(r)) {
                break;
            }
        }
        return new int[]{l + 1, r - 1};
    }
}
