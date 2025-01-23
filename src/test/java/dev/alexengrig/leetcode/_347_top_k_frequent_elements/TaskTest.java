package dev.alexengrig.leetcode._347_top_k_frequent_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new HeapSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        assertThat(solution.topKFrequent(nums, k)).containsExactlyInAnyOrder(1, 2);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] nums = {1};
        int k = 1;
        assertArrayEquals(new int[]{1}, solution.topKFrequent(nums, k));
    }
}