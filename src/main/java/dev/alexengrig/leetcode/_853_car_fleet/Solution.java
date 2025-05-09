package dev.alexengrig.leetcode._853_car_fleet;

import java.util.Arrays;

class Solution implements Task {
    @Override
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        Arrays.sort(indices, (l, r) -> position[r] - position[l]);
        int count = 0;
        double max = 0;
        for (int index : indices) {
            double time = (double) (target - position[index]) / speed[index];
            if (max < time) {
                count++;
                max = time;
            }
        }
        return count;
    }
}
