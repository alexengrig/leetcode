package dev.alexengrig.leetcode._2657_find_prefix_common_array_of_two_arrays;

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
        int[] a = {1, 3, 2, 4};
        int[] b = {3, 1, 2, 4};
        assertArrayEquals(new int[]{0, 2, 3, 4}, solution.findThePrefixCommonArray(a, b));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] a = {2, 3, 1};
        int[] b = {3, 1, 2};
        assertArrayEquals(new int[]{0, 1, 3}, solution.findThePrefixCommonArray(a, b));
    }
}