package dev.alexengrig.leetcode.premium._161_one_edit_distance;

class Solution implements Task {
    @Override
    public boolean isOneEditDistance(String s, String t) {
        String shorStr, longStr;
        if (s.length() <= t.length()) {
            shorStr = s;
            longStr = t;
        } else {
            shorStr = t;
            longStr = s;
        }
        int shortLen = shorStr.length(), longLen = longStr.length();
        if (longLen - shortLen > 1) {
            return false;
        }
        for (int i = 0; i < shortLen; i++) {
            if (shorStr.charAt(i) != longStr.charAt(i)) {
                if (shortLen == longLen) {
                    // replace longStr[i] with shortStr[i]
                    return shorStr.substring(i + 1).equals(longStr.substring(i + 1));
                }
                // delete longStr[i]
                return shorStr.substring(i).equals(longStr.substring(i + 1));
            }
        }
        // delete longStr[longLen - 1]
        return shortLen == longLen - 1;
    }
}
