package dev.alexengrig.leetcode._841_keys_and_rooms;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution implements Task {
    @Override
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        dfs(rooms, 0, visited);
        return rooms.size() == visited.size();
    }

    void dfs(List<List<Integer>> rooms, int room, Set<Integer> visited) {
        visited.add(room);
        for (int key : rooms.get(room)) {
            if (!visited.contains(key)) {
                dfs(rooms, key, visited);
            }
        }
    }
}
