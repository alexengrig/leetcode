package dev.alexengrig.leetcode.design._2349_design_number_container_system;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class NumberContainersTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MyNumberContainers())
        );
    }

    static void assertActions(NumberContainers containers, ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer expectedValue = av.expectedValues[i];
            switch (action) {
                case "NumberContainers" -> assertNull(expectedValue);
                case "change" -> {
                    containers.change(values[0], values[1]);
                    assertNull(expectedValue);
                }
                case "find" -> {
                    int actual = containers.find(values[0]);
                    assertNotNull(expectedValue);
                    assertEquals(expectedValue, actual);
                }
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(NumberContainers containers) {
        assertActions(containers, new ActionsAndValues(
                new String[]{"NumberContainers", "find", "change", "change", "change", "change", "find", "change", "find"},
                new int[][]{{}, {10}, {2, 10}, {1, 10}, {3, 10}, {5, 10}, {10}, {1, 20}, {10}},
                new Integer[]{null, -1, null, null, null, null, 1, null, 2}
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