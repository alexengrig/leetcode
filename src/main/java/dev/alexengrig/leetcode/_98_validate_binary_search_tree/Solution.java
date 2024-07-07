package dev.alexengrig.leetcode._98_validate_binary_search_tree;

class Solution implements Task {
    @Override
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) {
            return true;
        }
        if (min != null && min >= root.val) {
            return false;
        }
        if (max != null && max <= root.val) {
            return false;
        }
        return isValidBST(root.left, min, root.val)
               && isValidBST(root.right, root.val, max);
    }
}
