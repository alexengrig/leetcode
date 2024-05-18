package dev.alexengrig.leetcode._1909_remove_element_to_array_increasing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new LineSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 2, 10, 5, 7};
        assertTrue(solution.canBeIncreasing(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {2, 3, 1, 2};
        assertFalse(solution.canBeIncreasing(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1, 1, 1};
        assertFalse(solution.canBeIncreasing(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int[] nums = {100, 21, 100};
        assertTrue(solution.canBeIncreasing(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        int[] nums = {541, 783, 433, 744};
        assertFalse(solution.canBeIncreasing(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test5(Task solution) {
        int[] nums = {105, 924, 32, 968};
        assertTrue(solution.canBeIncreasing(nums));
    }
}