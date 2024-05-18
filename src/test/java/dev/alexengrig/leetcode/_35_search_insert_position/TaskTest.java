package dev.alexengrig.leetcode._35_search_insert_position;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new BinarySearchSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        assertEquals(2, solution.searchInsert(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        assertEquals(1, solution.searchInsert(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        assertEquals(4, solution.searchInsert(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        assertEquals(0, solution.searchInsert(nums, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        int[] nums = {1};
        int target = 1;
        assertEquals(0, solution.searchInsert(nums, target));
    }
}