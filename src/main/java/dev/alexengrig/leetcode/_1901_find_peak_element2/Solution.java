package dev.alexengrig.leetcode._1901_find_peak_element2;

class Solution implements Task {
    @Override
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, l = 0, r = n - 1, mid, col;
        while (l < r) {
            mid = l + (r - l) / 2;
            col = findMaxIndex(mat[mid]);
            if (mat[mid][col] > mat[mid + 1][col]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return new int[]{l, findMaxIndex(mat[l])};
    }

    int findMaxIndex(int[] nums) {
        int max = 0;
        for (int i = 1, n = nums.length; i < n; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }
}
