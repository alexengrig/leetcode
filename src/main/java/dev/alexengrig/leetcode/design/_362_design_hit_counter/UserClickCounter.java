package dev.alexengrig.leetcode.design._362_design_hit_counter;

import java.util.HashMap;
import java.util.Map;

class UserClickCounter {
    private final Map<Integer, ClickCounter> counterByUserId = new HashMap<>();

    /**
     * Is th user a bot (more 1000 clicks per 5 min)?
     */
    boolean clicks(int userId, int timestamp, int clicks) {
        ClickCounter counter = counterByUserId.computeIfAbsent(userId, k -> new ClickCounter());
        return counter.clicks(timestamp, clicks) > 1000;
    }

    private static class ClickCounter {
        private final int window = 5 * 60;
        private final int[] timestamps = new int[window];
        private final int[] clicks = new int[window];

        int clicks(int timestamp, int n) {
            int bucket = timestamp % window;
            if (timestamps[bucket] == timestamp) {
                clicks[bucket] += n;
            } else {
                timestamps[bucket] = timestamp;
                clicks[bucket] = n;
            }
            int count = 0;
            for (int i = 0; i < window; i++) {
                if (timestamp - timestamps[i] < window) {
                    count += clicks[i];
                }
            }
            return count;
        }
    }
}
