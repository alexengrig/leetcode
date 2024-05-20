package dev.alexengrig.leetcode._8_string_to_integer_atoi;

class Solution {
    public int myAtoi(String s) {
        final char[] chars = s.toCharArray();
        final int l = chars.length;
        int i = 0;
        while (i < l && chars[i] == ' ') {
            i++;
        }
        boolean isNegative = false;
        if (i < l && chars[i] == '-') {
            i++;
            isNegative = true;
        } else if (i < l && chars[i] == '+') {
            i++;
        }
        while (i < l && chars[i] == '0') {
            i++;
        }
        long result = 0, temp;
        while (i < l && chars[i] >= '0' && chars[i] <= '9') {
            if (result > (temp = result * 10 + chars[i] - '0')) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            result = temp;
            i++;
        }
        if ((int) result == result) {
            return isNegative ? (int) -result : (int) result;
        } else {
            return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
