package dev.alexengrig.leetcode._392_is_subsequence;

public class Solution implements Task {
    @Override
    public boolean isSubsequence(String s, String t) {
        int i = 0, n = s.length();
        for (int j = 0, m = t.length(); i < n && j < m; j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == n;
    }
}
