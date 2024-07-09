package dev.alexengrig.leetcode._279_perfect_squares;

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
        int n = 12;
        assertEquals(3, solution.numSquares(n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int n = 13;
        assertEquals(2, solution.numSquares(n));
    }
}