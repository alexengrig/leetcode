package dev.alexengrig.leetcode.design._2241_design_atm_machine;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class ATMTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MyATM())
        );
    }

    static void assertActions(ATM atm, ATMTest.ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer[] expectedValue = av.expectedValues[i];
            switch (action) {
                case "ATM" -> assertNull(expectedValue);
                case "deposit" -> {
                    atm.deposit(values);
                    assertNull(expectedValue);
                }
                case "withdraw" -> {
                    int[] actual = atm.withdraw(values[0]);
                    assertNotNull(expectedValue);
                    int[] expected = Arrays.stream(expectedValue).mapToInt(num -> num).toArray();
                    assertArrayEquals(expected, actual);
                }
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(ATM atm) {
        assertActions(atm, new ATMTest.ActionsAndValues(
                new String[]{"ATM", "deposit", "withdraw", "deposit", "withdraw", "withdraw"},
                new int[][]{{}, {0, 0, 1, 2, 1}, {600}, {0, 1, 0, 1, 1}, {600}, {550}},
                new Integer[][]{null, null, {0, 0, 1, 0, 1}, null, {-1}, {0, 1, 0, 0, 1}}
        ));
    }

    static class ActionsAndValues {
        String[] actions;
        int[][] values;
        Integer[][] expectedValues;

        public ActionsAndValues(String[] actions, int[][] values, Integer[][] expectedValues) {
            assertEquals(actions.length, values.length);
            assertEquals(values.length, expectedValues.length);
            this.actions = actions;
            this.values = values;
            this.expectedValues = expectedValues;
        }
    }
}