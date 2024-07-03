package dev.alexengrig.leetcode.design._146_lru_cache;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.function.Function;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class LRUCacheTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of((Function<Integer, LRUCache>) MyLRUCache::new),
                Arguments.of((Function<Integer, LRUCache>) LinkedLRUCache::new)
        );
    }

    static void assertActions(Function<Integer, LRUCache> cacheProducer, LRUCacheTest.ActionsAndValues av) {
        LRUCache cache = null;
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer expectedValue = av.expectedValues[i];
            switch (action) {
                case "LRUCache" -> {
                    assertNull(cache);
                    cache = cacheProducer.apply(values[0]);
                    assertNotNull(cache);
                }
                case "get" -> {
                    assertNotNull(cache);
                    assertEquals(expectedValue, cache.get(values[0]));
                }
                case "put" -> {
                    assertNotNull(cache);
                    cache.put(values[0], values[1]);
                }
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Function<Integer, LRUCache> cacheProducer) {
        assertActions(cacheProducer, new LRUCacheTest.ActionsAndValues(
                new String[]{"LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"},
                new int[][]{{2}, {1, 1}, {2, 2}, {1}, {3, 3}, {2}, {4, 4}, {1}, {3}, {4}},
                new Integer[]{null, null, null, 1, null, -1, null, -1, 3, 4}
        ));
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test1(Function<Integer, LRUCache> cacheProducer) {
        assertActions(cacheProducer, new LRUCacheTest.ActionsAndValues(
                new String[]{"LRUCache", "get", "get", "put", "get", "put", "put", "put", "put", "get", "put"},
                new int[][]{{1}, {6}, {8}, {12, 1}, {2}, {15, 11}, {5, 2}, {1, 15}, {4, 2}, {5}, {15, 15}},
                new Integer[]{null, -1, -1, null, -1, null, null, null, null, -1, null}
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