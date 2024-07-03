package dev.alexengrig.leetcode.design._933_number_of_recent_calls;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RecentCounterTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new QueueRecentCounter())
        );
    }

    static void assertActions(RecentCounter counter, ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer expectedValue = av.expectedValues[i];
            switch (action) {
                case "RecentCounter" -> assertNull(expectedValue);
                case "ping" -> assertEquals(expectedValue, counter.ping(values[0]));
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(RecentCounter counter) {
        assertActions(counter, new ActionsAndValues(
                new String[]{"RecentCounter", "ping", "ping", "ping", "ping"},
                new int[][]{{}, {1}, {100}, {3001}, {3002}},
                new Integer[]{null, 1, 2, 3, 3}
        ));
    }

    static class ActionsAndValues {
        String[] actions;
        int[][] values;
        Integer[] expectedValues;

        public ActionsAndValues(String[] actions, int[][] values, Integer[] expectedValues) {
            assertEquals(actions.length, values.length);
            assertEquals(values.length, expectedValues.length);
            this.actions = actions;
            this.values = values;
            this.expectedValues = expectedValues;
        }
    }
}