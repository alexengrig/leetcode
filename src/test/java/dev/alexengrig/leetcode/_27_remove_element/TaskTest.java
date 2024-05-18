package dev.alexengrig.leetcode._27_remove_element;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new LineSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        assertEquals(2, solution.removeElement(nums, val));
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        assertEquals(5, solution.removeElement(nums, val));
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(3, nums[2]);
        assertEquals(0, nums[3]);
        assertEquals(4, nums[4]);
    }
}