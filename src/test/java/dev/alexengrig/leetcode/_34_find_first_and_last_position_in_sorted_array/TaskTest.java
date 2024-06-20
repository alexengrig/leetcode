package dev.alexengrig.leetcode._34_find_first_and_last_position_in_sorted_array;

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
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        assertArrayEquals(new int[]{3, 4}, solution.searchRange(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {};
        int target = 0;
        assertArrayEquals(new int[]{-1, -1}, solution.searchRange(nums, target));
    }
}