package dev.alexengrig.leetcode._7_reverse_integer;

class Solution {
    public int reverse(int x) {
        long temp = 0;
        for (int i = x; i != 0; i /= 10) {
            temp = temp * 10 + i % 10;
        }
        return (int) temp == temp ? (int) temp : 0;
    }
}
