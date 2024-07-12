package dev.alexengrig.leetcode.design._362_design_hit_counter;

interface HitCounter {
    /**
     * Record a hit at the given timestamp.
     *
     * @param timestamp - The current timestamp in seconds granularity.
     */
    void hit(int timestamp);

    /**
     * Return the number of hits in the past 5 minutes.
     *
     * @param timestamp - The current timestamp in seconds granularity.
     * @return the total number of hits in the last 5 minutes.
     */
    int getHits(int timestamp);
}
