package dev.alexengrig.leetcode.design._380_insert_delete_getrandom;

interface RandomizedSet {
    boolean insert(int val);

    boolean remove(int val);

    int getRandom();
}
