package dev.alexengrig.leetcode._1346_check_if_n_and_its_double_exist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new HashSolution()),
                Arguments.of(new BinarySolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[] arr = {10, 2, 5, 3};
        assertTrue(solution.checkIfExist(arr));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] arr = {3, 1, 7, 11};
        assertFalse(solution.checkIfExist(arr));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        assertFalse(solution.checkIfExist(arr));
    }
}