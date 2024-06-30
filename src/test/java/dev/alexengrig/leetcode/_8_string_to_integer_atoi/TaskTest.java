package dev.alexengrig.leetcode._8_string_to_integer_atoi;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int result = solution.myAtoi("42");
        assertEquals(42, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int result = solution.myAtoi("   -42");
        assertEquals(-42, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int result = solution.myAtoi("4193 with words");
        assertEquals(4193, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int result = solution.myAtoi("words and 987");
        assertEquals(0, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        int result = solution.myAtoi("-91283472332");
        assertEquals(-2147483648, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test5(Task solution) {
        int result = solution.myAtoi("");
        assertEquals(0, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test6(Task solution) {
        int result = solution.myAtoi("18446744073709551617");
        assertEquals(2147483647, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test7(Task solution) {
        int result = solution.myAtoi("-6147483648");
        assertEquals(-2147483648, result);
    }
}