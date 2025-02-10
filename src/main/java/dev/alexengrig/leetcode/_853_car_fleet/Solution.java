package dev.alexengrig.leetcode._853_car_fleet;

import java.util.Arrays;

class Solution implements Task {
    @Override
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = position[i];
            pairs[i][1] = speed[i];
        }
        Arrays.sort(pairs, (l, r) -> r[0] - l[0]);
        int res = 0;
        double maxT = 0;
        for (int[] pair : pairs) {
            double t = (double) (target - pair[0]) / pair[1];
            if (t > maxT) {
                res++;
                maxT = t;
            }
        }
        return res;
    }
}
