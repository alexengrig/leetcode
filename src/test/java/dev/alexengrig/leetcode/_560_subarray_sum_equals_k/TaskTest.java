package dev.alexengrig.leetcode._560_subarray_sum_equals_k;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MapSolution()),
                Arguments.of(new N2Solution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 1, 1};
        int k = 2;
        assertEquals(2, solution.subarraySum(nums, k));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1, 2, 3};
        int k = 3;
        assertEquals(2, solution.subarraySum(nums, k));
    }
}