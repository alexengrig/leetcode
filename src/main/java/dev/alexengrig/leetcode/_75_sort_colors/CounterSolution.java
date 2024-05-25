package dev.alexengrig.leetcode._75_sort_colors;

class CounterSolution implements Task {
    @Override
    public void sortColors(int[] nums) {
        int red = 0, white = 0, blue = 0;
        for (int color : nums) {
            switch (color) {
                case 0 -> red++;
                case 1 -> white++;
                case 2 -> blue++;
            }
        }
        int index = 0;
        int l = index + red;
        while (index < l) {
            nums[index++] = 0;
        }
        l += white;
        while (index < l) {
            nums[index++] = 1;
        }
        l += blue;
        while (index < l) {
            nums[index++] = 2;
        }
    }
}
