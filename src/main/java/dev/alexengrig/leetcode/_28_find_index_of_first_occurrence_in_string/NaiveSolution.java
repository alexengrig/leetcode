package dev.alexengrig.leetcode._28_find_index_of_first_occurrence_in_string;

class NaiveSolution implements Task {
    @Override
    public int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        for (int i = 0, n = hay.length - need.length; i <= n; i++) {
            int j = 0;
            while (j < need.length && hay[i + j] == need[j]) {
                j++;
            }
            if (j == need.length) {
                return i;
            }
        }
        return -1;
    }
}
