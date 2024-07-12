package dev.alexengrig.leetcode.design._362_design_hit_counter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class HitCounterTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MyHitCounter())
        );
    }

    static void assertActions(HitCounter counter, ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer expectedValue = av.expectedValues[i];
            switch (action) {
                case "HitCounter" -> assertNull(expectedValue);
                case "hit" -> {
                    assertNull(expectedValue);
                    counter.hit(values[0]);
                }
                case "getHits" -> assertEquals(expectedValue, counter.getHits(values[0]));
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(HitCounter counter) {
        assertActions(counter, new ActionsAndValues(
                new String[]{"HitCounter", "hit", "hit", "hit", "getHits", "hit", "getHits", "getHits"},
                new int[][]{{}, {1}, {2}, {3}, {4}, {300}, {300}, {301}},
                new Integer[]{null, null, null, null, 3, null, 4, 3}
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