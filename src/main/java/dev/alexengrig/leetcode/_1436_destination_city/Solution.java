package dev.alexengrig.leetcode._1436_destination_city;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution implements Task {
    @Override
    public String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();
        for (List<String> cities : paths) {
            set.add(cities.get(0));
        }
        for (List<String> cities : paths) {
            if (!set.contains(cities.get(1))) {
                return cities.get(1);
            }
        }
        throw new IllegalArgumentException();
    }
}
