package dev.alexengrig.leetcode.design._2349_design_number_container_system;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class MyNumberContainers implements NumberContainers {
    private final Map<Integer, Integer> numberByIndex = new HashMap<>();
    private final Map<Integer, TreeSet<Integer>> indicesByNumber = new HashMap<>();

    @Override
    public void change(int index, int number) {
        if (numberByIndex.containsKey(index)) {
            int prevNumber = numberByIndex.get(index);
            TreeSet<Integer> prevIndices = indicesByNumber.get(prevNumber);
            prevIndices.remove(index);
            if (prevIndices.isEmpty()) {
                indicesByNumber.remove(prevNumber);
            }
        }
        numberByIndex.put(index, number);
        indicesByNumber.computeIfAbsent(number, key -> new TreeSet<>()).add(index);
    }

    @Override
    public int find(int number) {
        TreeSet<Integer> indices = indicesByNumber.get(number);
        if (indices == null) {
            return -1;
        }
        return indices.first();
    }
}
