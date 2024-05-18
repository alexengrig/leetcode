package dev.alexengrig.leetcode._13_roman_to_integer;

public class Solution implements Task {
    @Override
    public int romanToInt(String s) {
        int sum = 0, value, next, nextValue;
        char[] symbols = s.toCharArray();
        for (int curr = 0; curr < symbols.length; curr++) {
            value = value(symbols[curr]);
            if ((next = curr + 1) < symbols.length && value < (nextValue = value(symbols[next]))) {
                sum += nextValue - value;
                curr++;
            } else {
                sum += value;
            }
        }
        return sum;
    }

    int value(char symbol) {
        return switch (symbol) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Unknown symbol: " + symbol);
        };
    }
}
