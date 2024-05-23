package dev.alexengrig.leetcode._2511_maximum_enemy_forts_that_can_be_captured;

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
        int[] forts = {1, 0, 0, -1, 0, 0, 0, 0, 1};
        assertEquals(4, solution.captureForts(forts));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[] forts = {0, 0, 1, -1};
        assertEquals(0, solution.captureForts(forts));
    }
}