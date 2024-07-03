package dev.alexengrig.leetcode.design._933_number_of_recent_calls;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class QueueRecentCounter implements RecentCounter {
    private final Queue<Integer> calls = new LinkedList<>();

    @Override
    public int ping(int t) {
        int min = t - 3_000;
        Iterator<Integer> iterator = calls.iterator();
        while (iterator.hasNext() && iterator.next() < min) {
            iterator.remove();
        }
        calls.add(t);
        return calls.size();
    }
}
