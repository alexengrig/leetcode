package dev.alexengrig.leetcode._23_merge_k_sorted_lists;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution implements Task {
    @Override
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> heap = new PriorityQueue<>(Comparator.comparingInt(l -> l.val));
        for (ListNode head : lists) {
            if (head != null) {
                heap.offer(head);
            }
        }
        ListNode result = new ListNode(), prev = result, min;
        while (!heap.isEmpty()) {
            min = heap.poll();
            if (min.next != null) {
                heap.offer(min.next);
            }
            prev.next = min;
            prev = min;
        }
        return result.next;
    }
}
