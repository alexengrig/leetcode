package dev.alexengrig.leetcode._557_reverse_words_in_string3;

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
        String s = "Let's take LeetCode contest";
        assertEquals("s'teL ekat edoCteeL tsetnoc", solution.reverseWords(s));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "Mr Ding";
        assertEquals("rM gniD", solution.reverseWords(s));
    }
}