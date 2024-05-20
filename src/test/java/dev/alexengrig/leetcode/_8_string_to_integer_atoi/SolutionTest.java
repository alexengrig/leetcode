package dev.alexengrig.leetcode._8_string_to_integer_atoi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    static Solution solution = new Solution();

    void test(String s, int expected) {
        int result = solution.myAtoi(s);
        assertEquals(expected, result);
    }

    @Test
    void test1() {
        test("42", 42);
    }

    @Test
    void test2() {
        test("   -42", -42);
    }

    @Test
    void test3() {
        test("4193 with words", 4193);
    }

    @Test
    void test4() {
        test("words and 987", 0);
    }

    @Test
    void test5() {
        test("-91283472332", -2147483648);
    }

    @Test
    void test6() {
        test("", 0);
    }

    @Test
    void test7() {
        test("18446744073709551617", 2147483647);
    }

    @Test
    void test8() {
        test("-6147483648", -2147483648);
    }
}