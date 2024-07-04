package dev.alexengrig.leetcode._2215_find_the_difference_of_two_arrays;

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
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        assertEquals(List.of(List.of(1, 3), List.of(4, 6)), solution.findDifference(nums1, nums2));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};
        assertEquals(List.of(List.of(3), List.of()), solution.findDifference(nums1, nums2));
    }
}