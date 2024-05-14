package dev.alexengrig.leetcode.twosortedarrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return median(nums2);
        } else if (nums2.length == 0) {
            return median(nums1);
        }
        int[] nums = new int[nums1.length + nums2.length];
        int i, i1, i2, l;
        for (i = i1 = i2 = 0, l = nums.length; i < l; i++) {
            if (nums1[i1] <= nums2[i2]) {
                nums[i] = nums1[i1++];
            } else {
                nums[i] = nums2[i2++];
            }
            if (i1 >= nums1.length) {
                while (i2 < nums2.length) {
                    nums[++i] = nums2[i2++];
                }
                break;
            } else if (i2 >= nums2.length) {
                while (i1 < nums1.length) {
                    nums[++i] = nums1[i1++];
                }
                break;
            }
        }
        return median(nums);
    }

    public double median(int[] nums) {
        int mid = nums.length / 2;
        if (nums.length % 2 != 0) {
            return nums[mid];
        } else {
            return (nums[mid - 1] + nums[mid]) / 2d;
        }
    }
}
