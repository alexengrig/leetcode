package dev.alexengrig.leetcode.premium._356_line_reflection;

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
        int[][] points = {
                {1, 1}, {-1, 1}
        };
        assertTrue(solution.isReflected(points));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[][] points = {
                {1, 1}, {-1, -1}
        };
        assertFalse(solution.isReflected(points));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[][] points = {
                {1, 3}, {7, 3},
                {2, 1}, {6, 1},
                {3, 2}, {5, 2}
        };
        assertTrue(solution.isReflected(points));
    }
}