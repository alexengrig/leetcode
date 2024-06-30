package dev.alexengrig.leetcode.design._146_lru_cache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LinkedLRUCache implements LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;
    private final Set<Integer> keys;

    public LinkedLRUCache(int capacity) {
        this.capacity = capacity;
        int size = (int) Math.ceil(capacity / 0.75);
        this.cache = new HashMap<>(size);
        this.keys = new LinkedHashSet<>(size);
    }

    public int get(int key) {
        Integer value = cache.get(key);
        if (value == null) {
            return -1;
        }
        shiftUpKey(key);
        return value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.put(key, value);
            shiftUpKey(key);
        } else {
            if (cache.size() == capacity) {
                Iterator<Integer> iterator = keys.iterator();
                int lastKey = iterator.next();
                iterator.remove();
                cache.remove(lastKey);
            }
            cache.put(key, value);
            keys.add(key);
        }
    }

    private void shiftUpKey(int key) {
        keys.remove(key);
        keys.add(key);
    }
}
