package dev.alexengrig.leetcode._849_maximize_distance_to_closest_person;

class Solution implements Task {
    @Override
    public int maxDistToClosest(int[] seats) {
        int max = -1, start = 0, n = seats.length;
        for (int end = 0; end < n; end++) {
            if (seats[end] == 1) {
                if (max == -1) {
                    max = end;
                } else {
                    max = Math.max(max, (end - start) / 2);
                }
                start = end;
            }
        }
        return Math.max(max, (n - 1) - start);
    }
}
