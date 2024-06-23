package dev.alexengrig.leetcode.design._355_design_twitter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TwitterTest {
    static Stream<Arguments> provideSolutions() {
        return Stream.of(
                Arguments.of(new MyTwitter())
        );
    }

    static void assertActions(Twitter twitter, ActionsAndValues av) {
        for (int i = 0; i < av.actions.length; i++) {
            String action = av.actions[i];
            int[] values = av.values[i];
            Integer[] expectedValues = av.expectedValues[i];
            switch (action) {
                case "postTweet" -> {
                    twitter.postTweet(values[0], values[1]);
                    assertNull(expectedValues);
                }
                case "getNewsFeed" -> {
                    List<Integer> newsFeed = twitter.getNewsFeed(values[0]);
                    assertArrayEquals(expectedValues, newsFeed.toArray(Integer[]::new));
                }
                case "follow" -> {
                    twitter.follow(values[0], values[1]);
                    assertNull(expectedValues);
                }
                case "unfollow" -> {
                    twitter.unfollow(values[0], values[1]);
                    assertNull(expectedValues);
                }
                default -> throw new IllegalArgumentException("Unknown action");
            }
        }
    }

    @ParameterizedTest
    @MethodSource("provideSolutions")
    void test0(Twitter twitter) {
        assertActions(twitter, new ActionsAndValues(
                new String[]{"Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow", "getNewsFeed"},
                new int[][]{{}, {1, 5}, {1}, {1, 2}, {2, 6}, {1}, {1, 2}, {1}},
                new Integer[][]{null, null, {5}, null, null, {6, 5}, null, {5}}
        ));
    }

    static class ActionsAndValues {
        String[] actions;
        int[][] values;
        Integer[][] expectedValues;

        public ActionsAndValues(String[] actions, int[][] values, Integer[][] expectedValues) {
            assertEquals(actions.length, values.length);
            assertEquals(values.length, expectedValues.length);
            // skip "Twitter"
            this.actions = Arrays.copyOfRange(actions, 1, actions.length);
            // skip []
            this.values = Arrays.copyOfRange(values, 1, values.length);
            // skip []
            this.expectedValues = Arrays.copyOfRange(expectedValues, 1, expectedValues.length);
        }
    }
}