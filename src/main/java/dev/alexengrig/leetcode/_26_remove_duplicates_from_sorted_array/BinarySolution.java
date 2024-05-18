package dev.alexengrig.leetcode._26_remove_duplicates_from_sorted_array;

class BinarySolution implements Task {
    @Override
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return 1;
        }
        int last = nums.length - 1;
        int index = 0, next = 1;
        do {
            next = findNext(nums, next, last, nums[index]);
            if (next == -1) return index + 1;
            nums[++index] = nums[next];
        } while (next < last);
        return index + 1;
    }

    int findNext(int[] nums, int begin, int end, int value) {
        int next = -1;
        while (begin <= end) {
            int mid = begin + (end - begin) / 2;
            if (value >= nums[mid]) {
                begin = mid + 1;
            } else {
                next = mid;
                end = mid - 1;
            }
        }
        return next;
    }
}
