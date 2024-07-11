package dev.alexengrig.leetcode._215_kth_largest_element_in_array;

class QuickSelectSolution implements Task {
    @Override
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length, t = n - k, l = 0, r = n - 1;
        while (true) {
            if (l == r) {
                return nums[l];
            }
            int p = partition(nums, l, r);
            if (p >= t) {
                r = p;
            } else {
                l = p + 1;
            }
        }
    }

    int partition(int[] nums, int l, int r) {
        int m = (r + l) / 2, pivot = nums[m], i = l - 1, j = r + 1;
        while (i < j) {
            do {
                i++;
            } while (nums[i] < pivot);
            do {
                j--;
            } while (nums[j] > pivot);
            if (i < j) {
                swap(nums, i, j);
            }
        }
        return j;
    }

    void swap(int[] nums, int l, int r) {
        int tmp = nums[r];
        nums[r] = nums[l];
        nums[l] = tmp;
    }
}
