package dev.alexengrig.leetcode._14_longest_common_prefix;

class Solution implements Task {
    @Override
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0], other;
        for (int i = 0, k = first.length(); i < k; i++) {
            for (int j = 1, n = strs.length; j < n; j++) {
                other = strs[j];
                if (i == other.length() || first.charAt(i) != other.charAt(i)) {
                    return first.substring(0, i);
                }
            }
        }
        return first;
    }
}
