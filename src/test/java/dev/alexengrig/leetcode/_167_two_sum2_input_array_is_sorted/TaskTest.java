package dev.alexengrig.leetcode._167_two_sum2_input_array_is_sorted;

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
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(numbers, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] numbers = {2, 3, 4};
        int target = 6;
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(numbers, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] numbers = {-1, 0};
        int target = -1;
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(numbers, target));
    }
}