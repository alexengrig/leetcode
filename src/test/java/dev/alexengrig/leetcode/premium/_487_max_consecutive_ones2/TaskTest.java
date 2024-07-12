package dev.alexengrig.leetcode.premium._487_max_consecutive_ones2;

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
        int[] nums = {1, 0, 1, 1, 0};
        assertEquals(4, solution.findMaxConsecutiveOnes(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(4, solution.findMaxConsecutiveOnes(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1, 0, 1};
        assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int[] nums = {1, 1, 1};
        assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        int[] nums = {1, 0, 0, 1};
        assertEquals(2, solution.findMaxConsecutiveOnes(nums));
    }
}