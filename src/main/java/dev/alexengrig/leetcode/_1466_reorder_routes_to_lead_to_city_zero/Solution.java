package dev.alexengrig.leetcode._1466_reorder_routes_to_lead_to_city_zero;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
class Solution implements Task {
    @Override
    public int minReorder(int n, int[][] connections) {
        List<Item>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] connection : connections) {
            int from = connection[0];
            int to = connection[1];
            graph[from].add(new Item(to, true));
            graph[to].add(new Item(from, false));
        }
        return dfs(graph, 0, -1);
    }

    int dfs(List<Item>[] graph, int from, int parent) {
        int reorders = 0;
        for (Item item : graph[from]) {
            int index = item.index;
            if (index != parent) {
                if (item.directed) {
                    reorders++;
                }
                reorders += dfs(graph, index, from);
            }
        }
        return reorders;
    }

    static class Item {
        int index;
        boolean directed;

        Item(int index, boolean directed) {
            this.index = index;
            this.directed = directed;
        }
    }
}
