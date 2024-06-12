package dev.alexengrig.leetcode._33_search_in_rotated_sorted_array;

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
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        assertEquals(4, solution.search(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        assertEquals(-1, solution.search(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1};
        int target = 0;
        assertEquals(-1, solution.search(nums, target));
    }
}