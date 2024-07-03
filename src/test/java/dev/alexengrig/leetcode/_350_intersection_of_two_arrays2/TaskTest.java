package dev.alexengrig.leetcode._350_intersection_of_two_arrays2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MapSolution()),
                Arguments.of(new TwoPointersSolution()),
                Arguments.of(new BinarySearchSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        assertArrayEquals(new int[]{2, 2}, solution.intersect(nums1, nums2));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] actual = solution.intersect(nums1, nums2);
        assertTrue(Arrays.equals(actual, new int[]{9, 4}) || Arrays.equals(actual, new int[]{4, 9}));
    }
}