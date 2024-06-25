package dev.alexengrig.leetcode._692_top_k_frequent_words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution implements Task {
    @Override
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.compute(word, (key, count) -> count == null ? 1 : count + 1);
        }
        Queue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((l, r) -> {
            if (!Objects.equals(l.getValue(), r.getValue())) {
                return r.getValue().compareTo(l.getValue());
            }
            return l.getKey().compareTo(r.getKey());
        });
        heap.addAll(frequencyMap.entrySet());
        List<String> results = new ArrayList<>(k);
        for (int i = 0; i < k && !heap.isEmpty(); i++) {
            results.add(heap.poll().getKey());
        }
        return results;
    }
}
