package dev.alexengrig.leetcode._15_3sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
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
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = solution.threeSum(nums);
        assertEquals(2, results.size());
        assertEquals(List.of(-1, -1, 2), results.get(0));
        assertEquals(List.of(-1, 0, 1), results.get(1));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 1, 1};
        List<List<Integer>> results = solution.threeSum(nums);
        assertEquals(0, results.size());
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {0, 0, 0};
        List<List<Integer>> results = solution.threeSum(nums);
        assertEquals(1, results.size());
        assertEquals(List.of(0, 0, 0), results.get(0));
    }
}