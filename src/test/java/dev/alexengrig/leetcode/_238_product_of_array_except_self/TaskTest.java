package dev.alexengrig.leetcode._238_product_of_array_except_self;

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
        int[] nums = {1, 2, 3, 4};
        assertArrayEquals(new int[]{24, 12, 8, 6}, solution.productExceptSelf(nums));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {-1, 1, 0, -3, 3};
        assertArrayEquals(new int[]{0, 0, 9, 0, 0}, solution.productExceptSelf(nums));
    }
}