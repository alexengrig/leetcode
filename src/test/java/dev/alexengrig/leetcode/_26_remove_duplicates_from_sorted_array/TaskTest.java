package dev.alexengrig.leetcode._26_remove_duplicates_from_sorted_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new LineSolution()),
                Arguments.of(new BinarySolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 1, 2};
        assertEquals(2, solution.removeDuplicates(nums));
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, solution.removeDuplicates(nums));
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(3, nums[3]);
        assertEquals(4, nums[4]);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] nums = {1, 1};
        assertEquals(1, solution.removeDuplicates(nums));
        assertEquals(1, nums[0]);
    }

}