package dev.alexengrig.leetcode._567_permutation_in_string;

import java.util.HashMap;
import java.util.Map;

class MapSolution implements Task {
    @Override
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 > n2) {
            return false;
        }
        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            counts.compute(ch, (k, count) -> count == null ? 1 : count + 1);
        }
        int size = n1;
        for (int left = 0, right = 0; right < n2; right++) {
            if (0 <= counts.compute(s2.charAt(right), (k, count) -> count == null ? -1 : count - 1)) {
                size--;
            }
            while (size == 0) {
                if (right - left + 1 == n1) {
                    return true;
                }
                if (0 < counts.compute(s2.charAt(left++), (k, count) -> count == null ? 1 : count + 1)) {
                    size++;
                }
            }
        }
        return false;
    }
}
