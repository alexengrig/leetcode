package dev.alexengrig.leetcode._66_plus_one;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] digits = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 4}, solution.plusOne(digits));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] digits = {4, 3, 2, 1};
        assertArrayEquals(new int[]{4, 3, 2, 2}, solution.plusOne(digits));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] digits = {9};
        assertArrayEquals(new int[]{1, 0}, solution.plusOne(digits));
    }
}