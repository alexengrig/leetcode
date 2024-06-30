package dev.alexengrig.leetcode._2657_find_prefix_common_array_of_two_arrays;

class Solution implements Task {
    @Override
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] results = new int[n];
        int[] counts = new int[n];
        int prefix = 0;
        for (int i = 0; i < n; i++) {
            if (++counts[A[i] - 1] == 2) {
                prefix++;
            }
            if (++counts[B[i] - 1] == 2) {
                prefix++;
            }
            results[i] = prefix;
        }
        return results;
    }
}
