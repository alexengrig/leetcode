package dev.alexengrig.leetcode._739_daily_temperatures;

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
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, solution.dailyTemperatures(temperatures));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] temperatures = {30, 40, 50, 60};
        assertArrayEquals(new int[]{1, 1, 1, 0}, solution.dailyTemperatures(temperatures));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] temperatures = {30, 60, 90};
        assertArrayEquals(new int[]{1, 1, 0}, solution.dailyTemperatures(temperatures));
    }
}