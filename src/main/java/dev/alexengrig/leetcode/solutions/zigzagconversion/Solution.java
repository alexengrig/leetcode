package dev.alexengrig.leetcode.solutions.zigzagconversion;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        int length = s.length();
        StringBuilder builder = new StringBuilder(length);
        int maxStep = (numRows * 2) - 2;
        int index = 0;
        while (index < length) {
            builder.append(s.charAt(index));
            index += maxStep;
        }
        for (int numRow = 1, l = numRows - 1, step; numRow < l; numRow++) {
            index = numRow;
            step = maxStep - numRow * 2;
            while (index < length) {
                builder.append(s.charAt(index));
                index = index + step;
                step = +(maxStep - step);
            }
        }
        index = numRows - 1;
        while (index < length) {
            builder.append(s.charAt(index));
            index += maxStep;
        }
        return builder.toString();
    }
}
