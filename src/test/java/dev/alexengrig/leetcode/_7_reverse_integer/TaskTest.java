package dev.alexengrig.leetcode._7_reverse_integer;

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
        int result = solution.reverse(123);
        assertEquals(321, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int result = solution.reverse(-123);
        assertEquals(-321, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int result = solution.reverse(120);
        assertEquals(21, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int result = solution.reverse(0);
        assertEquals(0, result);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        int result = solution.reverse(1534236469);
        assertEquals(0, result);
    }
}