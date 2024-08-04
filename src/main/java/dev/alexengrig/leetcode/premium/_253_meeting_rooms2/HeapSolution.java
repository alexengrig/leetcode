package dev.alexengrig.leetcode.premium._253_meeting_rooms2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class HeapSolution implements Task {
    @Override
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        Queue<Integer> endsHeap = new PriorityQueue<>();
        for (int[] interval : intervals) {
            if (!endsHeap.isEmpty() && interval[0] >= endsHeap.peek()) {
                endsHeap.poll();
            }
            endsHeap.offer(interval[1]);
        }
        return endsHeap.size();
    }
}
