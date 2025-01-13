package dev.alexengrig.leetcode._219_contains_duplicate2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new SetSolution()),
                Arguments.of(new MapSolution()),
                Arguments.of(new BruteForceSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 0, 1, 1};
        int k = 1;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }
}