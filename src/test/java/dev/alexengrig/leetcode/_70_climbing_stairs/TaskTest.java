package dev.alexengrig.leetcode._70_climbing_stairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new LineSolution()),
                Arguments.of(new ArraySolution()),
                Arguments.of(new FibonacciSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int n = 2;
        assertEquals(2, solution.climbStairs(n));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int n = 3;
        assertEquals(3, solution.climbStairs(n));
    }
}