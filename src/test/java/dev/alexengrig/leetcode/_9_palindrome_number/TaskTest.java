package dev.alexengrig.leetcode._9_palindrome_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new Solution())
        );
    }

    static void test(Task solution, int x, boolean expected) {
        assertEquals(expected, solution.isPalindrome(x));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        test(solution, 1221, true);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        test(solution, 121, true);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        test(solution, -121, false);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        test(solution, 10, false);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test4(Task solution) {
        test(solution, -101, false);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test5(Task solution) {
        test(solution, 101, true);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test6(Task solution) {
        test(solution, 1000021, false);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test7(Task solution) {
        test(solution, 1000001, true);
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test8(Task solution) {
        test(solution, 10022201, false);
    }
}