package dev.alexengrig.leetcode.design._155_min_stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MinStackTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MyMinStack())
        );
    }

    static void assertActions(MinStack stack, ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer expectedValue = av.expectedValues[i];
            switch (action) {
                case "MinStack" -> assertNull(expectedValue);
                case "push" -> {
                    stack.push(values[0]);
                    assertNull(expectedValue);
                }
                case "pop" -> {
                    stack.pop();
                    assertNull(expectedValue);
                }
                case "top" -> assertEquals(expectedValue, stack.top());
                case "getMin" -> assertEquals(expectedValue, stack.getMin());
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(MinStack stack) {
        assertActions(stack, new ActionsAndValues(
                new String[]{"MinStack", "push", "push", "push", "getMin", "pop", "top", "getMin"},
                new int[][]{{}, {-2}, {0}, {-3}, {}, {}, {}, {}},
                new Integer[]{null, null, null, null, -3, null, 0, -2}
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