package dev.alexengrig.leetcode._2255_count_prefixes_of_given_string;

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
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String s = "abc";
        assertEquals(3, solution.countPrefixes(words, s));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String[] words = {"a", "a"};
        String s = "aa";
        assertEquals(2, solution.countPrefixes(words, s));
    }
}