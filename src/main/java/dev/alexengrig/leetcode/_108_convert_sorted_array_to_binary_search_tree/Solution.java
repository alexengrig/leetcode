package dev.alexengrig.leetcode._108_convert_sorted_array_to_binary_search_tree;

class Solution implements Task {
    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        } else if (left == right) {
            return new TreeNode(nums[left]);
        }
        int mid = right + (left - right) / 2;
        return new TreeNode(
                nums[mid],
                sortedArrayToBST(nums, left, mid - 1),
                sortedArrayToBST(nums, mid + 1, right)
        );
    }
}
