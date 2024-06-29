package dev.alexengrig.leetcode.design._380_insert_delete_getrandom;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Objects;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomizedSetTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MyRandomizedSet())
        );
    }

    static void assertActions(RandomizedSet set, RandomizedSetTest.ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Object expectedValue = av.expectedValues[i];
            switch (action) {
                case "RandomizedSet" -> assertNull(expectedValue);
                case "insert" -> assertEquals(expectedValue, set.insert(values[0]));
                case "remove" -> assertEquals(expectedValue, set.remove(values[0]));
                case "getRandom" -> {
                    boolean check = false;
                    for (int j = 10; j > 0; j--) {
                        check = Objects.equals(expectedValue, set.getRandom());
                        if (check) {
                            break;
                        }
                    }
                    assertTrue(check);
                }
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(RandomizedSet set) {
        assertActions(set, new RandomizedSetTest.ActionsAndValues(
                new String[]{"RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"},
                new int[][]{{}, {1}, {2}, {2}, {}, {1}, {2}, {}},
                new Object[]{null, true, false, true, 2, true, false, 2}
        ));
    }

    static class ActionsAndValues {
        String[] actions;
        int[][] values;
        Object[] expectedValues;

        public ActionsAndValues(String[] actions, int[][] values, Object[] expectedValues) {
            assertEquals(actions.length, values.length);
            assertEquals(values.length, expectedValues.length);
            this.actions = actions;
            this.values = values;
            this.expectedValues = expectedValues;
        }
    }
}