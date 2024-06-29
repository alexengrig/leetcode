package dev.alexengrig.leetcode.design._707_design_linked_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class MyLinkedListTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MySingleLinkedList()),
                Arguments.of(new MyDoubleLinkedList())
        );
    }

    static void assertActions(MyLinkedList list, ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer expectedValue = av.expectedValues[i];
            switch (action) {
                case "MyLinkedList" -> assertNull(expectedValue);
                case "get" -> assertEquals(expectedValue, list.get(values[0]));
                case "addAtHead" -> {
                    list.addAtHead(values[0]);
                    assertNull(expectedValue);
                }
                case "addAtTail" -> {
                    list.addAtTail(values[0]);
                    assertNull(expectedValue);
                }
                case "addAtIndex" -> {
                    list.addAtIndex(values[0], values[1]);
                    assertNull(expectedValue);
                }
                case "deleteAtIndex" -> {
                    list.deleteAtIndex(values[0]);
                    assertNull(expectedValue);
                }
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(MyLinkedList list) {
        assertActions(list, new ActionsAndValues(
                new String[]{"MyLinkedList", "addAtHead", "addAtTail", "addAtIndex", "get", "deleteAtIndex", "get"},
                new int[][]{{}, {1}, {3}, {1, 2}, {1}, {1}, {1}},
                new Integer[]{null, null, null, null, 2, null, 3}
        ));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(MyLinkedList list) {
        assertActions(list, new ActionsAndValues(
                new String[]{"MyLinkedList", "addAtHead", "addAtHead", "addAtHead", "addAtIndex", "deleteAtIndex", "addAtHead", "addAtTail", "get", "addAtHead", "addAtIndex", "addAtHead"},
                new int[][]{{}, {7}, {2}, {1}, {3, 0}, {2}, {6}, {4}, {4}, {4}, {5, 0}, {6}},
                new Integer[]{null, null, null, null, null, null, null, null, 4, null, null, null}
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