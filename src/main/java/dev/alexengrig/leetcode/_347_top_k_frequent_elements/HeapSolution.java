package dev.alexengrig.leetcode._347_top_k_frequent_elements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class HeapSolution implements Task {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.compute(num, (key, count) -> count == null ? 1 : count + 1);
        }
        Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] results = new int[k];
        for (int i = 0; i < k && !heap.isEmpty(); i++) {
            results[i] = heap.poll().getKey();
        }
        return results;
    }
}
