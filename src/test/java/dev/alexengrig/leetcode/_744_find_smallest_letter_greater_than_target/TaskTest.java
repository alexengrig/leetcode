package dev.alexengrig.leetcode._744_find_smallest_letter_greater_than_target;

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

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        assertEquals('c', solution.nextGreatestLetter(letters, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        assertEquals('f', solution.nextGreatestLetter(letters, target));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        char[] letters = {'x', 'x', 'y', 'y'};
        char target = 'z';
        assertEquals('x', solution.nextGreatestLetter(letters, target));
    }
}