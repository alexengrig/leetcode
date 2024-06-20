package dev.alexengrig.leetcode._34_find_first_and_last_position_in_sorted_array;

class Solution implements Task {
    @Override
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length, l = 0, r = n - 1, mid;
        if (n > 0) {
            while (l <= r) {
                mid = l + (r - l) / 2;
                if (nums[mid] == target) {
                    return new int[]{
                            searchLeft(nums, target, mid),
                            searchRight(nums, target, mid)
                    };
                } else if (nums[mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return new int[]{-1, -1};
    }

    int searchLeft(int[] nums, int target, int index) {
        return search(nums, target, 0, index, false);
    }

    int searchRight(int[] nums, int target, int index) {
        return search(nums, target, index, nums.length - 1, true);
    }

    int search(int[] nums, int target, int begin, int end, boolean left2Right) {
        int result = nums[begin] == target ? begin : end;
        int l = begin, r = end, mid;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (target < nums[mid]) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                result = mid;
                if (left2Right) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return result;
    }
}
