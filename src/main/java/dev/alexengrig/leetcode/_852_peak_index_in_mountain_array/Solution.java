package dev.alexengrig.leetcode._852_peak_index_in_mountain_array;

// dev.alexengrig.leetcode._162_find_peak_element.Solution
@SuppressWarnings("DuplicatedCode")
class Solution implements Task {
    @Override
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length, l = 0, r = n - 1, mid;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (arr[mid] >= arr[mid + 1]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}
