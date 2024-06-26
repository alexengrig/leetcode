package dev.alexengrig.leetcode._12_integer_to_roman;

class Solution implements Task {
    @Override
    public String intToRoman(int num) {
        StringBuilder builder = new StringBuilder();
        if (num / 1000 > 0) {
            builder.append("M".repeat(num / 1000));
            num %= 1000;
        }
        if (num / 900 == 1) {
            builder.append("CM");
            num %= 900;
        }
        if (num / 500 == 1) {
            builder.append("D");
            num %= 500;
        }
        if (num / 400 == 1) {
            builder.append("CD");
            num %= 400;
        }
        if (num / 100 > 0) {
            builder.append("C".repeat(num / 100));
            num %= 100;
        }
        if (num / 90 == 1) {
            builder.append("XC");
            num %= 90;
        }
        if (num / 50 == 1) {
            builder.append("L");
            num %= 50;
        }
        if (num / 40 == 1) {
            builder.append("XL");
            num %= 40;
        }
        if (num / 10 > 0) {
            builder.append("X".repeat(num / 10));
            num %= 10;
        }
        if (num / 9 == 1) {
            builder.append("IX");
            num %= 9;
        }
        if (num / 5 == 1) {
            builder.append("V");
            num %= 5;
        }
        if (num / 4 == 1) {
            builder.append("IV");
            num %= 4;
        }
        if (num > 0) {
            builder.append("I".repeat(num));
        }
        return builder.toString();
    }
}
