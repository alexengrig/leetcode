package dev.alexengrig.leetcode._387_first_unique_character_in_string;

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
        String s = "leetcode";
        assertEquals(0, solution.firstUniqChar(s));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        String s = "loveleetcode";
        assertEquals(2, solution.firstUniqChar(s));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        String s = "aabb";
        assertEquals(-1, solution.firstUniqChar(s));
    }
}