package dev.alexengrig.leetcode._367_valid_perfect_square;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int num = 16;
        assertTrue(solution.isPerfectSquare(num));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int num = 14;
        assertFalse(solution.isPerfectSquare(num));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int num = 1;
        assertTrue(solution.isPerfectSquare(num));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int num = 2;
        assertFalse(solution.isPerfectSquare(num));
    }
}