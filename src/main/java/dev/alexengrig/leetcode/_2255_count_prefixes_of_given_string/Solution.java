package dev.alexengrig.leetcode._2255_count_prefixes_of_given_string;

class Solution implements Task {
    @Override
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for (String word : words) {
            if (word.length() <= s.length()) {
                boolean hasPrefix = true;
                for (int i = 0, n = word.length(); i < n; i++) {
                    if (word.charAt(i) != s.charAt(i)) {
                        hasPrefix = false;
                        break;
                    }
                }
                if (hasPrefix) {
                    count++;
                }
            }
        }
        return count;
    }
}
