package dev.alexengrig.leetcode._2511_maximum_enemy_forts_that_can_be_captured;

class Solution implements Task {
    @Override
    public int captureForts(int[] forts) {
        int max = 0, count = 0;
        boolean hasPlace = false, hasFort = false;
        for (int fort : forts) {
            switch (fort) {
                case 1 -> {
                    if (hasPlace) {
                        max = Math.max(max, count);
                    }
                    count = 0;
                    hasPlace = false;
                    hasFort = true;
                }
                case 0 -> {
                    if (hasPlace || hasFort) count++;
                }
                case -1 -> {
                    if (hasFort) {
                        max = Math.max(max, count);
                        hasFort = false;
                    }
                    count = 0;
                    hasPlace = true;
                }
            }
        }
        return max;
    }
}
