package dev.alexengrig.leetcode._28_find_index_of_first_occurrence_in_string;

class KMPSolution implements Task {
    @Override
    public int strStr(String haystack, String needle) {
        char[] hay = haystack.toCharArray();
        char[] need = needle.toCharArray();
        int[] lps = lps(needle.toCharArray());
        int r = 0, l = 0;
        while ((need.length - l) <= (hay.length - r)) {
            if (need[l] == hay[r]) {
                l++;
                r++;
            }
            if (l == need.length) {
                return r - l;
            }
            if (r < hay.length && need[l] != hay[r]) {
                if (l != 0) {
                    l = lps[l - 1];
                } else {
                    r++;
                }
            }
        }
        return -1;
    }

    int[] lps(char[] need) {
        int[] lps = new int[need.length];
        int l = 0, r = 1;
        while (r < need.length) {
            if (need[l] == need[r]) {
                l++;
                lps[r] = l;
                r++;
            } else if (l != 0) {
                l = lps[l - 1];
            } else {
                lps[r] = l;
                r++;
            }
        }
        return lps;
    }
}
