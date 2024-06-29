package dev.alexengrig.leetcode.design._380_insert_delete_getrandom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

class MyRandomizedSet implements RandomizedSet {
    private final List<Integer> values = new ArrayList<>();
    private final Map<Integer, Integer> val2Idx = new HashMap<>();
    private final Random random = new Random();

    public boolean insert(int val) {
        if (val2Idx.containsKey(val)) {
            return false;
        }
        int index = values.size();
        values.add(val);
        val2Idx.put(val, index);
        return true;
    }

    public boolean remove(int val) {
        Integer index = val2Idx.get(val);
        if (index == null) {
            return false;
        }
        int lastIndex = values.size() - 1;
        int lastVal = values.get(lastIndex);
        values.set(index, lastVal);
        values.remove(lastIndex);
        val2Idx.put(lastVal, index);
        val2Idx.remove(val);
        return true;
    }

    public int getRandom() {
        int index = random.nextInt(values.size());
        return values.get(index);
    }
}
