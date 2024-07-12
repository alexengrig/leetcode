package dev.alexengrig.leetcode.design._362_design_hit_counter;

public class MyHitCounter implements HitCounter {
    private final int window = 5 * 60;
    private final int[] timestamps = new int[window];
    private final int[] hits = new int[window];

    public void hit(int timestamp) {
        int bucket = timestamp % window;
        if (timestamps[bucket] == timestamp) {
            hits[bucket]++;
        } else {
            timestamps[bucket] = timestamp;
            hits[bucket] = 1;
        }
    }

    public int getHits(int timestamp) {
        int count = 0;
        for (int bucket = 0; bucket < window; bucket++) {
            if (timestamp - timestamps[bucket] < window) {
                count += hits[bucket];
            }
        }
        return count;
    }
}
