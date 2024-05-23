package dev.alexengrig.leetcode._88_merge_sorted_array;

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
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(new int[]{1}, nums1);
    }
}