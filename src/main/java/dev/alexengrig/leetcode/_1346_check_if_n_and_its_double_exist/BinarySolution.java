package dev.alexengrig.leetcode._1346_check_if_n_and_its_double_exist;

import java.util.Arrays;

class BinarySolution implements Task {
    @Override
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int index;
        for (int i = 0; i < arr.length; i++) {
            if ((index = findTarget(arr, arr[i] * 2)) != -1 && index != i) {
                return true;
            }
        }
        return false;
    }

    int findTarget(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
