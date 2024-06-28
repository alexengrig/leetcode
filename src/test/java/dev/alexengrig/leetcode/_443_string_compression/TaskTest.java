package dev.alexengrig.leetcode._443_string_compression;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, solution.compress(chars));
        assertArrayEquals(new char[]{'a', '2', 'b', '2', 'c', '3'}, Arrays.copyOf(chars, 6));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        char[] chars = {'a'};
        assertEquals(1, solution.compress(chars));
        assertArrayEquals(new char[]{'a'}, Arrays.copyOf(chars, 1));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, solution.compress(chars));
        assertArrayEquals(new char[]{'a', 'b', '1', '2'}, Arrays.copyOf(chars, 4));
    }
}