package dev.alexengrig.leetcode._605_can_place_flowers;

class Solution implements Task {
    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) {
            return true;
        }
        boolean emptyStart = flowerbed[0] == 0;
        if (flowerbed.length == 1) {
            return emptyStart;
        }
        int count = 0, lineCount = 0;
        boolean hasFlowers = false;
        for (int place : flowerbed) {
            if (place == 1) {
                if (!hasFlowers) {
                    hasFlowers = true;
                }
                if (lineCount > 0) {
                    if (!emptyStart) {
                        count += lineCount % 2 == 0 ? (lineCount - 1) / 2 : lineCount / 2;
                    } else {
                        emptyStart = false;
                        count += lineCount / 2;
                    }
                    lineCount = 0;
                }
            } else if (place == 0) {
                lineCount++;
            }
        }
        if (lineCount > 0) {
            if (hasFlowers) {
                count += lineCount / 2;
            } else {
                count += (lineCount + 1) / 2;
            }
        }
        return count >= n;
    }
}
