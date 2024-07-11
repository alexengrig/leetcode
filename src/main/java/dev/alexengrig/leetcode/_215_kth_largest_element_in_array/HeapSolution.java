package dev.alexengrig.leetcode._215_kth_largest_element_in_array;

import java.util.PriorityQueue;
import java.util.Queue;

class HeapSolution implements Task {
    @Override
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add(num);
            while (heap.size() > k) {
                heap.remove();
            }
        }
        return heap.element();
    }
}
