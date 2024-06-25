package dev.alexengrig.leetcode._347_top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution implements Task {
    @Override
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.compute(num, (key, count) -> count == null ? 1 : count + 1);
        }
        Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((l, r) -> r.getValue().compareTo(l.getValue()));
        heap.addAll(frequencyMap.entrySet());
        int[] results = new int[k];
        for (int i = 0; i < k && !heap.isEmpty(); i++) {
            results[i] = heap.poll().getKey();
        }
        return results;
    }
}
