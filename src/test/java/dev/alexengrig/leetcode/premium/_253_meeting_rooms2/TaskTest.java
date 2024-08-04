package dev.alexengrig.leetcode.premium._253_meeting_rooms2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new HeapSolution())
        );
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Task solution) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        assertEquals(2, solution.minMeetingRooms(intervals));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Task solution) {
        int[][] intervals = {{1, 4}, {2, 5}, {7, 9}};
        assertEquals(2, solution.minMeetingRooms(intervals));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test2(Task solution) {
        int[][] intervals = {{1, 4}, {2, 5}, {3, 6}};
        assertEquals(3, solution.minMeetingRooms(intervals));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test3(Task solution) {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}};
        assertEquals(1, solution.minMeetingRooms(intervals));
    }
}