package dev.alexengrig.leetcode.design._362_design_hit_counter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserClickCounterTest {
    @Test
    void should_show_bot() {
        UserClickCounter counter = new UserClickCounter();
        assertFalse(counter.clicks(1, 0, 500));
        assertFalse(counter.clicks(2, 50, 400));
        assertFalse(counter.clicks(1, 100, 500));
        assertFalse(counter.clicks(2, 250, 400));
        assertTrue(counter.clicks(1, 200, 500));
        assertFalse(counter.clicks(2, 350, 400));
    }
}